{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/compressors/lz4/FramedLZ4CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FramedLZ4CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 40,
      "end_line": 390,
      "comment": "\n * CompressorInputStream for the LZ4 frame format.\n *\n * \u003cp\u003eBased on the \"spec\" in the version \"1.5.1 (31/03/2015)\"\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://lz4.github.io/lz4/lz4_Frame_format.html\"\u003eLZ4 Frame Format Description\u003c/a\u003e\n * @since 1.14\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "LZ4_SIGNATURE"
      ],
      "begin_line": 43,
      "end_line": 45,
      "comment": " used by FramedLZ4CompressorOutputStream as well"
    },
    {
      "type": "field",
      "varNames": [
        "SKIPPABLE_FRAME_TRAILER"
      ],
      "begin_line": 46,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SKIPPABLE_FRAME_PREFIX_BYTE_MASK"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_MASK"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SUPPORTED_VERSION"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_INDEPENDENCE_MASK"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_CHECKSUM_MASK"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONTENT_SIZE_MASK"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONTENT_CHECKSUM_MASK"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_MAX_SIZE_MASK"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNCOMPRESSED_FLAG_MASK"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " used in no-arg read method"
    },
    {
      "type": "field",
      "varNames": [
        "supplier"
      ],
      "begin_line": 63,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.Anonymous-67c61eb3-8e21-4486-9908-6e145a8555e3.getAsByte()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectBlockChecksum"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectBlockDependency"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectContentSize"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectContentChecksum"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentBlock"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "endReached",
        "inUncompressed"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentHash"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " used for frame header checksum and content checksum, if present"
    },
    {
      "type": "field",
      "varNames": [
        "blockHash"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " used for block checksum, if present"
    },
    {
      "type": "field",
      "varNames": [
        "blockDependencyBuffer"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " only created if the frame doesn\u0027t set the block independence flag"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.FramedLZ4CompressorInputStream(java.io.InputStream)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Creates a new input stream that decompresses streams compressed\n     * using the LZ4 frame format and stops after decompressing the\n     * first frame.\n     * @param in  the InputStream from which to read the compressed data\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.FramedLZ4CompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n     * Creates a new input stream that decompresses streams compressed\n     * using the LZ4 frame format.\n     * @param in  the InputStream from which to read the compressed data\n     * @param decompressConcatenated if true, decompress until the end\n     *          of the input; if false, stop after the first LZ4 frame\n     *          and leave the input position to point to the next byte\n     *          after the frame stream\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 21)",
        "(line 113,col 9)-(line 113,col 61)",
        "(line 114,col 9)-(line 114,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.read()",
      "begin_line": 118,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.close()",
      "begin_line": 124,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.read(byte[], int, int)",
      "begin_line": 134,
      "end_line": 155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 38)",
        "(line 140,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.init(boolean)",
      "begin_line": 157,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.readSignature(boolean)",
      "begin_line": 164,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 111)",
        "(line 166,col 9)-(line 166,col 37)",
        "(line 167,col 9)-(line 167,col 44)",
        "(line 168,col 9)-(line 168,col 20)",
        "(line 169,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 37)",
        "(line 179,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.readFrameDescriptor()",
      "begin_line": 190,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 34)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 34)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 71)",
        "(line 200,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 65)",
        "(line 208,col 9)-(line 208,col 61)",
        "(line 209,col 9)-(line 209,col 69)",
        "(line 210,col 9)-(line 210,col 35)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 35)",
        "(line 215,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 39)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 72)",
        "(line 229,col 9)-(line 229,col 28)",
        "(line 230,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.nextBlock()",
      "begin_line": 235,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 34)",
        "(line 237,col 9)-(line 237,col 59)",
        "(line 238,col 9)-(line 238,col 67)",
        "(line 239,col 9)-(line 239,col 62)",
        "(line 240,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 65)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.maybeFinishCurrentBlock()",
      "begin_line": 266,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.verifyContentChecksum()",
      "begin_line": 277,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.verifyChecksum(org.apache.commons.compress.compressors.lz4.XXHash32, java.lang.String)",
      "begin_line": 284,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 38)",
        "(line 286,col 9)-(line 286,col 51)",
        "(line 287,col 9)-(line 287,col 20)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 44)",
        "(line 292,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.readOneByte()",
      "begin_line": 297,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 32)",
        "(line 299,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.readOnce(byte[], int, int)",
      "begin_line": 306,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 87)",
        "(line 313,col 9)-(line 313,col 39)",
        "(line 314,col 9)-(line 314,col 49)",
        "(line 315,col 9)-(line 315,col 41)",
        "(line 316,col 9)-(line 316,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.isSkippableFrameSignature(byte[])",
      "begin_line": 319,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.skipSkippableFrame(byte[])",
      "begin_line": 339,
      "end_line": 352,
      "comment": "\n     * Skips over the contents of a skippable frame as well as\n     * skippable frames following it.\n     *\n     * \u003cp\u003eIt then tries to read four more bytes which are supposed to\n     * hold an LZ4 signature and returns the number of bytes read\n     * while storing the bytes in the given array.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 21)",
        "(line 341,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.appendToBlockDependencyBuffer(byte[], int, int)",
      "begin_line": 354,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 58)",
        "(line 356,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.matches(byte[], int)",
      "begin_line": 376,
      "end_line": 389,
      "comment": "\n     * Checks if the signature matches what is expected for a .lz4 file.\n     *\n     * \u003cp\u003e.lz4 files start with a four byte signature.\u003c/p\u003e\n     *\n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return          true if this is a .sz stream, false otherwise\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 382,col 40)",
        "(line 383,col 9)-(line 386,col 9)",
        "(line 388,col 9)-(line 388,col 58)"
      ]
    }
  ]
}