#!/usr/bin/env bash

set -e
./gradlew --no-daemon clean installdist
mkdir -p ~/apps
rm -rf ~/apps/boot-hello
mv build/install/boot-hello ~/apps/
