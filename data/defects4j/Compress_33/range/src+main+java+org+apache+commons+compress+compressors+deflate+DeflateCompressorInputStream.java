{
  "filepath": "/tmp/Compress-33b/src/main/java/org/apache/commons/compress/compressors/deflate/DeflateCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeflateCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 32,
      "end_line": 106,
      "comment": "\n * Deflate decompressor.\n * @since 1.9\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.DeflateCompressorInputStream(java.io.InputStream)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Creates a new input stream that decompresses Deflate-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     *\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.DeflateCompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.deflate.DeflateParameters)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Creates a new input stream that decompresses Deflate-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     * @param       parameters parameters\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read()",
      "begin_line": 60,
      "end_line": 65,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 28)",
        "(line 63,col 9)-(line 63,col 33)",
        "(line 64,col 9)-(line 64,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read(byte[], int, int)",
      "begin_line": 68,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 41)",
        "(line 71,col 9)-(line 71,col 19)",
        "(line 72,col 9)-(line 72,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.skip(long)",
      "begin_line": 76,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.available()",
      "begin_line": 82,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.close()",
      "begin_line": 88,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 19)"
      ]
    }
  ]
}