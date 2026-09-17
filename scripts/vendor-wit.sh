#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
DEPS_DIR="$ROOT/wit/deps"
P2="${WASI_P2_VERSION:-0.2.12}"
REGISTRY="${WKG_REGISTRY:-wasi.dev}"

if ! command -v wkg >/dev/null; then
  echo "wkg is required. Install with:" >&2
  echo "  cargo install wkg" >&2
  exit 1
fi

rm -rf "$DEPS_DIR"
mkdir -p "$DEPS_DIR"

wkg get --registry "$REGISTRY" --overwrite --format wit "wasi:cli@${P2}" -o "$DEPS_DIR/cli.wit"
wkg get --registry "$REGISTRY" --overwrite --format wit "wasi:clocks@${P2}" -o "$DEPS_DIR/clocks.wit"
wkg get --registry "$REGISTRY" --overwrite --format wit "wasi:filesystem@${P2}" -o "$DEPS_DIR/filesystem.wit"
wkg get --registry "$REGISTRY" --overwrite --format wit "wasi:http@${P2}" -o "$DEPS_DIR/http.wit"
wkg get --registry "$REGISTRY" --overwrite --format wit "wasi:io@${P2}" -o "$DEPS_DIR/io.wit"
wkg get --registry "$REGISTRY" --overwrite --format wit "wasi:random@${P2}" -o "$DEPS_DIR/random.wit"
wkg get --registry "$REGISTRY" --overwrite --format wit "wasi:sockets@${P2}" -o "$DEPS_DIR/sockets.wit"

echo "Vendored WASI ${P2} WIT files into wit/deps/."
