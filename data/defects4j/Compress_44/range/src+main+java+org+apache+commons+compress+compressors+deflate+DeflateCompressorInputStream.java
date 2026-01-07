{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/compressors/deflate/DeflateCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeflateCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 32,
      "end_line": 124,
      "comment": "\n * Deflate decompressor.\n * @since 1.9\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_1"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_2a"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_2b"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_2c"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_2d"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inflater"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.DeflateCompressorInputStream(java.io.InputStream)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Creates a new input stream that decompresses Deflate-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     *\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.DeflateCompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.deflate.DeflateParameters)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * Creates a new input stream that decompresses Deflate-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     * @param       parameters parameters\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 62)",
        "(line 63,col 9)-(line 63,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read()",
      "begin_line": 67,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)",
        "(line 70,col 9)-(line 70,col 33)",
        "(line 71,col 9)-(line 71,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read(byte[], int, int)",
      "begin_line": 75,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 47)",
        "(line 78,col 9)-(line 78,col 19)",
        "(line 79,col 9)-(line 79,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.skip(long)",
      "begin_line": 83,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.available()",
      "begin_line": 89,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.close()",
      "begin_line": 95,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byte[], int)",
      "begin_line": 117,
      "end_line": 123,
      "comment": "\n     * Checks if the signature matches what is expected for a zlib / deflated file\n     *  with the zlib header.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is zlib / deflate compressed with a header\n     * stream, false otherwise\n     * \n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 122,col 49)"
      ]
    }
  ]
}