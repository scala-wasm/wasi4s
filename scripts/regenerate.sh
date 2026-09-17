#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
WIT_DIR="$ROOT/wit"
OUT_DIR="$ROOT/wasip2/src/main/scala"
BASE_PACKAGE="io.github.scalawasm.wasi4s"
GEN_ROOT="$OUT_DIR/io/github/scalawasm/wasi4s"

CHECK=false
if [[ "${1:-}" == "--check" ]]; then
  CHECK=true
fi

if ! command -v wit-bindgen-scala >/dev/null; then
  echo "wit-bindgen-scala is required. Install with:" >&2
  echo "  cargo install wit-bindgen-scala --version 0.1.0" >&2
  exit 1
fi

GEN_FLAGS=()
if [[ "$CHECK" == true ]]; then
  GEN_FLAGS+=(--check)
else
  rm -rf "$GEN_ROOT/wasi" "$GEN_ROOT/exports"
  mkdir -p "$OUT_DIR"
fi

run_bindgen() {
  local world="$1"
  if (( ${#GEN_FLAGS[@]} > 0 )); then
    wit-bindgen-scala "$WIT_DIR" \
      --out-dir "$OUT_DIR" \
      --base-package "$BASE_PACKAGE" \
      --world "$world" \
      "${GEN_FLAGS[@]}"
  else
    wit-bindgen-scala "$WIT_DIR" \
      --out-dir "$OUT_DIR" \
      --base-package "$BASE_PACKAGE" \
      --world "$world"
  fi
}

run_bindgen "wasi:cli/imports"
run_bindgen "wasi:http/proxy"

if [[ "$CHECK" == true ]]; then
  echo "Bindings are up to date."
fi
