#!/bin/bash

set -euox pipefail
{
  IFS=$'\n\t'
} &>/dev/null

mvn versions:display-dependency-updates
mvn versions:display-plugin-updates
mvn versions:display-property-updates
