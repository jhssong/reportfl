{
  "filepath": "/tmp/Compress-33b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 41,
      "end_line": 208,
      "comment": "\n * Compressed output stream using the gzip format. This implementation improves\n * over the standard {@link GZIPOutputStream} class by allowing\n * the configuration of the compression level and the header metadata (filename,\n * comment, modification time, operating system and extra flags).\n * \n * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc1952\"\u003eGZIP File Format Specification\u003c/a\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "FNAME"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Header flag indicating a file name follows the header "
    },
    {
      "type": "field",
      "varNames": [
        "FCOMMENT"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Header flag indicating a comment follows the header "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The underlying stream "
    },
    {
      "type": "field",
      "varNames": [
        "deflater"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Deflater used to compress the data "
    },
    {
      "type": "field",
      "varNames": [
        "deflateBuffer"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The buffer receiving the compressed data from the deflater "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Indicates if the stream has been closed "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The checksum of the uncompressed data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.GzipCompressorOutputStream(java.io.OutputStream)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Creates a gzip compressed output stream with the default parameters.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.GzipCompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.gzip.GzipParameters)",
      "begin_line": 76,
      "end_line": 81,
      "comment": "\n     * Creates a gzip compressed output stream with the specified parameters.\n     * \n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 23)",
        "(line 78,col 9)-(line 78,col 77)",
        "(line 80,col 9)-(line 80,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.writeHeader(org.apache.commons.compress.compressors.gzip.GzipParameters)",
      "begin_line": 83,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 51)",
        "(line 85,col 9)-(line 85,col 49)",
        "(line 87,col 9)-(line 87,col 52)",
        "(line 88,col 9)-(line 88,col 46)",
        "(line 89,col 9)-(line 89,col 60)",
        "(line 90,col 9)-(line 90,col 45)",
        "(line 91,col 9)-(line 91,col 95)",
        "(line 92,col 9)-(line 92,col 71)",
        "(line 95,col 9)-(line 95,col 64)",
        "(line 96,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 59)",
        "(line 106,col 9)-(line 106,col 34)",
        "(line 108,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.writeTrailer()",
      "begin_line": 119,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 51)",
        "(line 121,col 9)-(line 121,col 46)",
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 45)",
        "(line 125,col 9)-(line 125,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.write(int)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.write(byte[])",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 148,
      "end_line": 162,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.deflate()",
      "begin_line": 164,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 78)",
        "(line 166,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.finish()",
      "begin_line": 176,
      "end_line": 186,
      "comment": "\n     * Finishes writing compressed data to the underlying stream without closing it.\n     * \n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.flush()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.close()",
      "begin_line": 198,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 205,col 9)"
      ]
    }
  ]
}