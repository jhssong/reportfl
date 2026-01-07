{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 41,
      "end_line": 214,
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
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Creates a gzip compressed output stream with the default parameters.\n     * @param out the stream to compress to\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.GzipCompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.gzip.GzipParameters)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "\n     * Creates a gzip compressed output stream with the specified parameters.\n     * @param out the stream to compress to\n     * @param parameters the parameters to use\n     * @throws IOException if writing fails\n     * \n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 23)",
        "(line 83,col 9)-(line 83,col 77)",
        "(line 85,col 9)-(line 85,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.writeHeader(org.apache.commons.compress.compressors.gzip.GzipParameters)",
      "begin_line": 88,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 57)",
        "(line 90,col 9)-(line 90,col 55)",
        "(line 92,col 9)-(line 92,col 58)",
        "(line 93,col 9)-(line 93,col 46)",
        "(line 94,col 9)-(line 94,col 60)",
        "(line 95,col 9)-(line 95,col 45)",
        "(line 96,col 9)-(line 96,col 95)",
        "(line 97,col 9)-(line 97,col 71)",
        "(line 100,col 9)-(line 100,col 70)",
        "(line 101,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 59)",
        "(line 111,col 9)-(line 111,col 34)",
        "(line 113,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.writeTrailer()",
      "begin_line": 124,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 57)",
        "(line 126,col 9)-(line 126,col 46)",
        "(line 127,col 9)-(line 127,col 44)",
        "(line 128,col 9)-(line 128,col 45)",
        "(line 130,col 9)-(line 130,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.write(int)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.write(byte[])",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 153,
      "end_line": 167,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.deflate()",
      "begin_line": 169,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 84)",
        "(line 171,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.finish()",
      "begin_line": 182,
      "end_line": 192,
      "comment": "\n     * Finishes writing compressed data to the underlying stream without closing it.\n     * \n     * @since 1.7\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.flush()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream.close()",
      "begin_line": 204,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 211,col 9)"
      ]
    }
  ]
}