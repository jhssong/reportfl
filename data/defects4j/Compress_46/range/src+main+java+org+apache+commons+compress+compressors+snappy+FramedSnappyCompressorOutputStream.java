{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FramedSnappyCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 38,
      "end_line": 151,
      "comment": "\n * CompressorOutputStream for the framing Snappy format.\n *\n * \u003cp\u003eBased on the \"spec\" in the version \"Last revised: 2013-10-25\"\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"https://github.com/google/snappy/blob/master/framing_format.txt\"\u003eSnappy framing format description\u003c/a\u003e\n * @since 1.14\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_COMPRESSED_BUFFER_SIZE"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " \u003e easily use small fixed-size buffers."
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
        "checksum"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " used in one-arg write method"
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentIndex"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "consumer"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.FramedSnappyCompressorOutputStream(java.io.OutputStream)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Constructs a new output stream that compresses\n     * snappy-framed-compressed data to the specified output stream.\n     * @param out the OutputStream to which to write the compressed data\n     * @throws IOException if writing the signature fails\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 63,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.FramedSnappyCompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.lz77support.Parameters)",
      "begin_line": 74,
      "end_line": 79,
      "comment": "\n     * Constructs a new output stream that compresses\n     * snappy-framed-compressed data to the specified output stream.\n     * @param out the OutputStream to which to write the compressed data\n     * @param params parameters used to fine-tune compression, in\n     * particular to balance compression ratio vs compression speed.\n     * @throws IOException if writing the signature fails\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 23)",
        "(line 76,col 9)-(line 76,col 29)",
        "(line 77,col 9)-(line 77,col 63)",
        "(line 78,col 9)-(line 78,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.write(int)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 39)",
        "(line 84,col 9)-(line 84,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 87,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 63)",
        "(line 100,col 9)-(line 100,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.close()",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 17)",
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.finish()",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\n     * Compresses all remaining data and writes it to the stream,\n     * doesn\u0027t close the underlying stream.\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.flushBuffer()",
      "begin_line": 120,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 75)",
        "(line 122,col 9)-(line 122,col 65)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 38)",
        "(line 127,col 9)-(line 127,col 54)",
        "(line 128,col 9)-(line 128,col 19)",
        "(line 129,col 9)-(line 129,col 21)",
        "(line 130,col 9)-(line 130,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.writeLittleEndian(int, long)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.writeCrc()",
      "begin_line": 137,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 49)",
        "(line 139,col 9)-(line 139,col 56)",
        "(line 140,col 9)-(line 140,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.mask(long)",
      "begin_line": 143,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 36)",
        "(line 147,col 9)-(line 147,col 59)",
        "(line 148,col 9)-(line 148,col 25)",
        "(line 149,col 9)-(line 149,col 17)"
      ]
    }
  ]
}