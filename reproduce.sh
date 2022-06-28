#!/usr/bin/env bash

set -euo pipefail

pushd plugin
../bin/gradle jar
popd

pushd consumer
../bin/gradle :okhttp --info --stacktrace
popd
