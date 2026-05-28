package com.add.demo.file.hash;

import com.add.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
