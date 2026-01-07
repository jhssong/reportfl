{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FramedSnappyCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 37,
      "end_line": 135,
      "comment": "\n * CompressorOutputStream for the framing Snappy format.\n *\n * \u003cp\u003eBased on the \"spec\" in the version \"Last revised: 2013-10-25\"\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"https://github.com/google/snappy/blob/master/framing_format.txt\"\u003eSnappy framing format description\u003c/a\u003e\n * @since 1.14\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_COMPRESSED_BUFFER_SIZE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " \u003e easily use small fixed-size buffers."
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checksum"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " used in one-arg write method"
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentIndex"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "consumer"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.FramedSnappyCompressorOutputStream(java.io.OutputStream)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Constructs a new output stream that compresses\n     * snappy-framed-compressed data to the specified output stream.\n     * @param out the OutputStream to which to write the compressed data\n     * @throws IOException if writing the signature fails\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 23)",
        "(line 61,col 9)-(line 61,col 63)",
        "(line 62,col 9)-(line 62,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.write(int)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 39)",
        "(line 68,col 9)-(line 68,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 71,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 63)",
        "(line 84,col 9)-(line 84,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.close()",
      "begin_line": 87,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 17)",
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.finish()",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\n     * Compresses all remaining data and writes it to the stream,\n     * doesn\u0027t close the underlying stream.\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.flushBuffer()",
      "begin_line": 104,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 75)",
        "(line 106,col 9)-(line 106,col 65)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 38)",
        "(line 111,col 9)-(line 111,col 54)",
        "(line 112,col 9)-(line 112,col 19)",
        "(line 113,col 9)-(line 113,col 21)",
        "(line 114,col 9)-(line 114,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.writeLittleEndian(int, long)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.writeCrc()",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 49)",
        "(line 123,col 9)-(line 123,col 56)",
        "(line 124,col 9)-(line 124,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream.mask(long)",
      "begin_line": 127,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 36)",
        "(line 131,col 9)-(line 131,col 59)",
        "(line 132,col 9)-(line 132,col 25)",
        "(line 133,col 9)-(line 133,col 17)"
      ]
    }
  ]
}