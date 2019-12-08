#!/bin/bash

set -euox pipefail
{
  IFS=$'\n\t'
} &>/dev/null

chmod +x ./target/java-11-with-Graal