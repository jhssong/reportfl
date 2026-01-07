{
  "filepath": "/tmp/Compress-23b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 40,
      "end_line": 207,
      "comment": "\n * Compressed output stream using the gzip format. This implementation improves\n * over the standard {@link GZIPOutputStream} class by allowing\n * the configuration of the compression level and the header metadata (filename,\n * comment, modification time, operating system and extra flags).\n * \n * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc1952\"\u003eGZIP File Format Specification\u003c/a\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "FNAME"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Header flag indicating a file name follows the header "
    },
    {
      "type": "field",
      "varNames": [
        "FCOMMENT"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Header flag indicating a comment follows the header "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The underlying stream "
    },
    {
      "type": "field",
      "varNames": [
        "deflater"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Deflater used to compress the data "
    },
    {
      "type": "field",
      "varNames": [
        "deflateBuffer"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The buffer receiving the compressed data from the deflater "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Indicates if the stream has been closed "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The checksum of the uncompressed data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.GzipCompressorOutputStream(java.io.OutputStream)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Creates a gzip compressed output stream with the default parameters.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.GzipCompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.gzip.GzipParameters)",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\n     * Creates a gzip compressed output stream with the specified parameters.\n     * \n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 23)",
        "(line 77,col 9)-(line 77,col 77)",
        "(line 79,col 9)-(line 79,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.writeHeader(org.apache.commons.compress.compressors.gzip.GzipParameters)",
      "begin_line": 82,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 51)",
        "(line 84,col 9)-(line 84,col 49)",
        "(line 86,col 9)-(line 86,col 52)",
        "(line 87,col 9)-(line 87,col 46)",
        "(line 88,col 9)-(line 88,col 60)",
        "(line 89,col 9)-(line 89,col 45)",
        "(line 90,col 9)-(line 90,col 95)",
        "(line 91,col 9)-(line 91,col 71)",
        "(line 94,col 9)-(line 94,col 64)",
        "(line 95,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 59)",
        "(line 105,col 9)-(line 105,col 34)",
        "(line 107,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.writeTrailer()",
      "begin_line": 118,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 51)",
        "(line 120,col 9)-(line 120,col 46)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 124,col 9)-(line 124,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.write(int)",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.write(byte[])",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 147,
      "end_line": 161,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.deflate()",
      "begin_line": 163,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 78)",
        "(line 165,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.finish()",
      "begin_line": 175,
      "end_line": 185,
      "comment": "\n     * Finishes writing compressed data to the underlying stream without closing it.\n     * \n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.flush()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.close()",
      "begin_line": 197,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 204,col 9)"
      ]
    }
  ]
}