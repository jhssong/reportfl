{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/compressors/lz4/FramedLZ4CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FramedLZ4CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 37,
      "end_line": 325,
      "comment": "\n * CompressorOutputStream for the LZ4 frame format.\n *\n * \u003cp\u003eBased on the \"spec\" in the version \"1.5.1 (31/03/2015)\"\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://lz4.github.io/lz4/lz4_Frame_format.html\"\u003eLZ4 Frame Format Description\u003c/a\u003e\n * @since 1.14\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "END_MARK"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " used in one-arg write method"
    },
    {
      "type": "field",
      "varNames": [
        "blockData"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "params"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentIndex"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentHash"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " used for frame header checksum and content checksum, if requested"
    },
    {
      "type": "field",
      "varNames": [
        "blockHash"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " used for block checksum, if requested"
    },
    {
      "type": "field",
      "varNames": [
        "blockDependencyBuffer"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " only created if the config requires block dependency"
    },
    {
      "type": "field",
      "varNames": [
        "collectedBlockDependencyBytes"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size",
        "index"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.BlockSize(int, int)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 74,col 13)-(line 74,col 29)",
        "(line 75,col 13)-(line 75,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.getSize()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.getIndex()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parameters",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 88,
      "end_line": 171,
      "comment": "\n     * Parameters of the LZ4 frame format.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withContentChecksum",
        "withBlockChecksum",
        "withBlockDependency"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lz77params"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n         * The default parameters of 4M block size, enabled content\n         * checksum, disabled block checksums and independent blocks.\n         *\n         * \u003cp\u003eThis matches the defaults of the lz4 command line utility.\u003c/p\u003e\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.Parameters(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n         * Sets up custom a custom block size for the LZ4 stream but\n         * otherwise uses the defaults of enabled content checksum,\n         * disabled block checksums and independent blocks.\n         * @param blockSize the size of a single block.\n         ",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.Parameters(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize, org.apache.commons.compress.compressors.lz77support.Parameters)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n         * Sets up custom a custom block size for the LZ4 stream but\n         * otherwise uses the defaults of enabled content checksum,\n         * disabled block checksums and independent blocks.\n         * @param blockSize the size of a single block.\n         * @param lz77params parameters used to fine-tune compression,\n         * in particular to balance compression ratio vs compression\n         * speed.\n         ",
      "child_ranges": [
        "(line 121,col 13)-(line 121,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.Parameters(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize, boolean, boolean, boolean)",
      "begin_line": 135,
      "end_line": 139,
      "comment": "\n         * Sets up custom parameters for the LZ4 stream.\n         * @param blockSize the size of a single block.\n         * @param withContentChecksum whether to write a content checksum\n         * @param withBlockChecksum whether to write a block checksum.\n         * Note that block checksums are not supported by the lz4\n         * command line utility\n         * @param withBlockDependency whether a block may depend on\n         * the content of a previous block. Enabling this may improve\n         * compression ratio but makes it impossible to decompress the\n         * output in parallel.\n         ",
      "child_ranges": [
        "(line 137,col 13)-(line 138,col 82)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.Parameters(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize, boolean, boolean, boolean, org.apache.commons.compress.compressors.lz77support.Parameters)",
      "begin_line": 156,
      "end_line": 164,
      "comment": "\n         * Sets up custom parameters for the LZ4 stream.\n         * @param blockSize the size of a single block.\n         * @param withContentChecksum whether to write a content checksum\n         * @param withBlockChecksum whether to write a block checksum.\n         * Note that block checksums are not supported by the lz4\n         * command line utility\n         * @param withBlockDependency whether a block may depend on\n         * the content of a previous block. Enabling this may improve\n         * compression ratio but makes it impossible to decompress the\n         * output in parallel.\n         * @param lz77params parameters used to fine-tune compression,\n         * in particular to balance compression ratio vs compression\n         * speed.\n         ",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 39)",
        "(line 160,col 13)-(line 160,col 59)",
        "(line 161,col 13)-(line 161,col 55)",
        "(line 162,col 13)-(line 162,col 59)",
        "(line 163,col 13)-(line 163,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.toString()",
      "begin_line": 166,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 169,col 110)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.FramedLZ4CompressorOutputStream(java.io.OutputStream)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Constructs a new output stream that compresses data using the\n     * LZ4 frame format using the default block size of 4MB.\n     * @param out the OutputStream to which to write the compressed data\n     * @throws IOException if writing the signature fails\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.FramedLZ4CompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters)",
      "begin_line": 190,
      "end_line": 200,
      "comment": "\n     * Constructs a new output stream that compresses data using the\n     * LZ4 frame format using the given block size.\n     * @param out the OutputStream to which to write the compressed data\n     * @param params the parameters to use\n     * @throws IOException if writing the signature fails\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 29)",
        "(line 192,col 9)-(line 192,col 57)",
        "(line 193,col 9)-(line 193,col 23)",
        "(line 194,col 9)-(line 194,col 69)",
        "(line 195,col 9)-(line 195,col 64)",
        "(line 196,col 9)-(line 196,col 31)",
        "(line 197,col 9)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.write(int)",
      "begin_line": 202,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 39)",
        "(line 205,col 9)-(line 205,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 208,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 66)",
        "(line 224,col 9)-(line 224,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.close()",
      "begin_line": 227,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 17)",
        "(line 230,col 9)-(line 230,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.finish()",
      "begin_line": 238,
      "end_line": 246,
      "comment": "\n     * Compresses all remaining data and writes it to the stream,\n     * doesn\u0027t close the underlying stream.\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.writeFrameDescriptor()",
      "begin_line": 248,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 69)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 25)",
        "(line 260,col 9)-(line 260,col 34)",
        "(line 261,col 9)-(line 261,col 105)",
        "(line 262,col 9)-(line 262,col 22)",
        "(line 263,col 9)-(line 263,col 31)",
        "(line 264,col 9)-(line 264,col 64)",
        "(line 265,col 9)-(line 265,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.flushBlock()",
      "begin_line": 268,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 71)",
        "(line 270,col 9)-(line 270,col 65)",
        "(line 271,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 38)",
        "(line 282,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.writeTrailer()",
      "begin_line": 303,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 28)",
        "(line 305,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.appendToBlockDependencyBuffer(byte[], int, int)",
      "begin_line": 310,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 58)",
        "(line 312,col 9)-(line 322,col 9)"
      ]
    }
  ]
}