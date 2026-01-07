{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FramedSnappyCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 38,
      "end_line": 317,
      "comment": "\n * CompressorInputStream for the framing Snappy format.\n *\n * \u003cp\u003eBased on the \"spec\" in the version \"Last revised: 2013-10-25\"\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"https://github.com/google/snappy/blob/master/framing_format.txt\"\u003eSnappy framing format description\u003c/a\u003e\n * @since 1.7\n "
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
        "dialect"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The dialect to expect "
    },
    {
      "type": "field",
      "varNames": [
        "currentCompressedChunk"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " used in no-arg read method"
    },
    {
      "type": "field",
      "varNames": [
        "endReached",
        "inUncompressedChunk"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uncompressedBytesRemaining"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedChecksum"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checksum"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.FramedSnappyCompressorInputStream(java.io.InputStream)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Constructs a new input stream that decompresses\n     * snappy-framed-compressed data from the specified input stream\n     * using the {@link FramedSnappyDialect#STANDARD} dialect.\n     * @param in  the InputStream from which to read the compressed data\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.FramedSnappyCompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.snappy.FramedSnappyDialect)",
      "begin_line": 94,
      "end_line": 102,
      "comment": "\n     * Constructs a new input stream that decompresses snappy-framed-compressed data\n     * from the specified input stream.\n     * @param in  the InputStream from which to read the compressed data\n     * @param dialect the dialect used by the compressed stream\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 49)",
        "(line 98,col 9)-(line 98,col 31)",
        "(line 99,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.read()",
      "begin_line": 105,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.close()",
      "begin_line": 111,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.read(byte[], int, int)",
      "begin_line": 121,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 41)",
        "(line 124,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.available()",
      "begin_line": 135,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readOnce(byte[], int, int)",
      "begin_line": 153,
      "end_line": 179,
      "comment": "\n     * Read from the current chunk into the given array.\n     *\n     * @return -1 if there is no current chunk or the number of bytes\n     * read from the current chunk (which may be -1 if the end of the\n     * chunk is reached).\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 22)",
        "(line 155,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readNextBlock()",
      "begin_line": 181,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 37)",
        "(line 183,col 9)-(line 183,col 36)",
        "(line 184,col 9)-(line 184,col 39)",
        "(line 185,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readCrc()",
      "begin_line": 223,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 37)",
        "(line 225,col 9)-(line 225,col 50)",
        "(line 226,col 9)-(line 226,col 20)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 21)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.unmask(long)",
      "begin_line": 237,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 25)",
        "(line 241,col 9)-(line 241,col 25)",
        "(line 242,col 9)-(line 242,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readSize()",
      "begin_line": 245,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 18)",
        "(line 247,col 9)-(line 247,col 19)",
        "(line 248,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.skipBlock()",
      "begin_line": 258,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 36)",
        "(line 260,col 9)-(line 260,col 49)",
        "(line 261,col 9)-(line 261,col 20)",
        "(line 262,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readStreamIdentifier()",
      "begin_line": 267,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 38)",
        "(line 269,col 9)-(line 269,col 50)",
        "(line 270,col 9)-(line 270,col 20)",
        "(line 271,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readOneByte()",
      "begin_line": 276,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 32)",
        "(line 278,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.verifyLastChecksumAndReset()",
      "begin_line": 285,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 30)",
        "(line 290,col 9)-(line 290,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byte[], int)",
      "begin_line": 302,
      "end_line": 315,
      "comment": "\n     * Checks if the signature matches what is expected for a .sz file.\n     *\n     * \u003cp\u003e.sz files start with a chunk with tag 0xff and content sNaPpY.\u003c/p\u003e\n     * \n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return          true if this is a .sz stream, false otherwise\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 308,col 40)",
        "(line 309,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 314,col 57)"
      ]
    }
  ]
}