#!/usr/bin/groovy
package com.cleverbuilder

def build() {
  sh "ls -la"
}

def test(name) {
  sh "/usr/local/bin/${name}"
}