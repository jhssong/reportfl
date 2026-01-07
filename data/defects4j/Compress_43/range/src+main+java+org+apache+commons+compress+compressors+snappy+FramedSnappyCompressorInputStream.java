{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FramedSnappyCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 39,
      "end_line": 331,
      "comment": "\n * CompressorInputStream for the framing Snappy format.\n *\n * \u003cp\u003eBased on the \"spec\" in the version \"Last revised: 2013-10-25\"\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"https://github.com/google/snappy/blob/master/framing_format.txt\"\u003eSnappy framing format description\u003c/a\u003e\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_OFFSET"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * package private for tests only.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STREAM_IDENTIFIER_TYPE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "COMPRESSED_CHUNK_TYPE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNCOMPRESSED_CHUNK_TYPE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PADDING_CHUNK_TYPE"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MIN_UNSKIPPABLE_TYPE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_UNSKIPPABLE_TYPE"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_SKIPPABLE_TYPE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SZ_SIGNATURE"
      ],
      "begin_line": 55,
      "end_line": 59,
      "comment": " used by FramedSnappyCompressorOutputStream as well"
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The underlying stream to read compressed data from "
    },
    {
      "type": "field",
      "varNames": [
        "dialect"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The dialect to expect "
    },
    {
      "type": "field",
      "varNames": [
        "currentCompressedChunk"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " used in no-arg read method"
    },
    {
      "type": "field",
      "varNames": [
        "endReached",
        "inUncompressedChunk"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uncompressedBytesRemaining"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedChecksum"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checksum"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "supplier"
      ],
      "begin_line": 79,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.Anonymous-8ae27d01-8ce4-4331-89a3-551249e1b360.getAsByte()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 13)-(line 82,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.FramedSnappyCompressorInputStream(java.io.InputStream)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Constructs a new input stream that decompresses\n     * snappy-framed-compressed data from the specified input stream\n     * using the {@link FramedSnappyDialect#STANDARD} dialect.\n     * @param in  the InputStream from which to read the compressed data\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.FramedSnappyCompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.snappy.FramedSnappyDialect)",
      "begin_line": 104,
      "end_line": 108,
      "comment": "\n     * Constructs a new input stream that decompresses snappy-framed-compressed data\n     * from the specified input stream.\n     * @param in  the InputStream from which to read the compressed data\n     * @param dialect the dialect used by the compressed stream\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.FramedSnappyCompressorInputStream(java.io.InputStream, int, org.apache.commons.compress.compressors.snappy.FramedSnappyDialect)",
      "begin_line": 119,
      "end_line": 129,
      "comment": "\n     * Constructs a new input stream that decompresses snappy-framed-compressed data\n     * from the specified input stream.\n     * @param in  the InputStream from which to read the compressed data\n     * @param blockSize the block size to use for the compressed stream\n     * @param dialect the dialect used by the compressed stream\n     * @throws IOException if reading fails\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 49)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 31)",
        "(line 126,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.read()",
      "begin_line": 132,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.close()",
      "begin_line": 138,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.read(byte[], int, int)",
      "begin_line": 148,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 41)",
        "(line 151,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.available()",
      "begin_line": 162,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readOnce(byte[], int, int)",
      "begin_line": 180,
      "end_line": 206,
      "comment": "\n     * Read from the current chunk into the given array.\n     *\n     * @return -1 if there is no current chunk or the number of bytes\n     * read from the current chunk (which may be -1 if the end of the\n     * chunk is reached).\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 22)",
        "(line 182,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readNextBlock()",
      "begin_line": 208,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 37)",
        "(line 210,col 9)-(line 210,col 36)",
        "(line 211,col 9)-(line 211,col 39)",
        "(line 212,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readCrc()",
      "begin_line": 250,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 37)",
        "(line 252,col 9)-(line 252,col 50)",
        "(line 253,col 9)-(line 253,col 20)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.unmask(long)",
      "begin_line": 260,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 25)",
        "(line 264,col 9)-(line 264,col 25)",
        "(line 265,col 9)-(line 265,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readSize()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.skipBlock()",
      "begin_line": 272,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 36)",
        "(line 274,col 9)-(line 274,col 49)",
        "(line 275,col 9)-(line 275,col 20)",
        "(line 276,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readStreamIdentifier()",
      "begin_line": 281,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 38)",
        "(line 283,col 9)-(line 283,col 50)",
        "(line 284,col 9)-(line 284,col 20)",
        "(line 285,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readOneByte()",
      "begin_line": 290,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 32)",
        "(line 292,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.verifyLastChecksumAndReset()",
      "begin_line": 299,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 30)",
        "(line 304,col 9)-(line 304,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byte[], int)",
      "begin_line": 316,
      "end_line": 329,
      "comment": "\n     * Checks if the signature matches what is expected for a .sz file.\n     *\n     * \u003cp\u003e.sz files start with a chunk with tag 0xff and content sNaPpY.\u003c/p\u003e\n     * \n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return          true if this is a .sz stream, false otherwise\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 322,col 40)",
        "(line 323,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 328,col 57)"
      ]
    }
  ]
}