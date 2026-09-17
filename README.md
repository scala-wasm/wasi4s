# wasi4s

WASIp2 API bindings for [scala-wasm](https://github.com/scala-wasm/scala-wasm).

## Usage

```scala
libraryDependencies += "io.github.scala-wasm" %%% "wasi4s" % "0.1.0+wasi-0.2.12"
```

```scala
import io.github.scalawasm.wasi4s.wasi.cli.stdout._

val stdout = getStdout()
stdout.blockingWriteAndFlush("Hello, WASI!\n")
```

## Updating WIT and bindings

```bash
cargo install wkg
./scripts/vendor-wit.sh
```

Then regenerate Scala bindings:

```bash
cargo install wit-bindgen-scala --version 0.1.0
./scripts/regenerate.sh
```

`./scripts/regenerate.sh --check` verifies committed bindings are up to date.
