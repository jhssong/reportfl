{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FramedSnappyCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 39,
      "end_line": 291,
      "comment": "\n * CompressorInputStream for the framing Snappy format.\n *\n * \u003cp\u003eBased on the \"spec\" in the version \"Last revised: 2013-10-25\"\u003c/p\u003e\n *\n * @see \"http://code.google.com/p/snappy/source/browse/trunk/framing_format.txt\"\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_OFFSET"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * package private for tests only.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STREAM_IDENTIFIER_TYPE"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "COMPRESSED_CHUNK_TYPE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNCOMPRESSED_CHUNK_TYPE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PADDING_CHUNK_TYPE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MIN_UNSKIPPABLE_TYPE"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_UNSKIPPABLE_TYPE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_SKIPPABLE_TYPE"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SZ_SIGNATURE"
      ],
      "begin_line": 53,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The underlying stream to read compressed data from "
    },
    {
      "type": "field",
      "varNames": [
        "currentCompressedChunk"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " used in no-arg read method"
    },
    {
      "type": "field",
      "varNames": [
        "endReached",
        "inUncompressedChunk"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uncompressedBytesRemaining"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedChecksum"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checksum"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.FramedSnappyCompressorInputStream(java.io.InputStream)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Constructs a new input stream that decompresses snappy-framed-compressed data\n     * from the specified input stream.\n     * @param in  the InputStream from which to read the compressed data\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 49)",
        "(line 80,col 9)-(line 80,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.read()",
      "begin_line": 84,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.close()",
      "begin_line": 90,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.read(byte[], int, int)",
      "begin_line": 100,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 41)",
        "(line 103,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.available()",
      "begin_line": 114,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readOnce(byte[], int, int)",
      "begin_line": 132,
      "end_line": 158,
      "comment": "\n     * Read from the current chunk into the given array.\n     *\n     * @return -1 if there is no current chunk or the number of bytes\n     * read from the current chunk (which may be -1 if the end of the\n     * chunk is reached).\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 22)",
        "(line 134,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readNextBlock()",
      "begin_line": 160,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 37)",
        "(line 162,col 9)-(line 162,col 36)",
        "(line 163,col 9)-(line 163,col 33)",
        "(line 164,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readCrc()",
      "begin_line": 197,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 31)",
        "(line 199,col 9)-(line 199,col 44)",
        "(line 200,col 9)-(line 200,col 20)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 21)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.unmask(long)",
      "begin_line": 211,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 25)",
        "(line 215,col 9)-(line 215,col 25)",
        "(line 216,col 9)-(line 216,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readSize()",
      "begin_line": 219,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 18)",
        "(line 221,col 9)-(line 221,col 19)",
        "(line 222,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.skipBlock()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 30)",
        "(line 234,col 9)-(line 234,col 43)",
        "(line 235,col 9)-(line 235,col 20)",
        "(line 236,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readStreamIdentifier()",
      "begin_line": 241,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 32)",
        "(line 243,col 9)-(line 243,col 44)",
        "(line 244,col 9)-(line 244,col 20)",
        "(line 245,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readOneByte()",
      "begin_line": 250,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 26)",
        "(line 252,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.verifyLastChecksumAndReset()",
      "begin_line": 259,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 30)",
        "(line 264,col 9)-(line 264,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byte[], int)",
      "begin_line": 276,
      "end_line": 289,
      "comment": "\n     * Checks if the signature matches what is expected for a .sz file.\n     *\n     * \u003cp\u003e.sz files start with a chunk with tag 0xff and content sNaPpY.\u003c/p\u003e\n     * \n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return          true if this is a .sz stream, false otherwise\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 40)",
        "(line 283,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 57)"
      ]
    }
  ]
}