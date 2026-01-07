{
  "filepath": "/tmp/Compress-29b/src/main/java/org/apache/commons/compress/compressors/deflate/DeflateCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeflateCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 32,
      "end_line": 91,
      "comment": "\n * Deflate decompressor.\n * @since 1.9\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.DeflateCompressorInputStream(java.io.InputStream)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Creates a new input stream that decompresses Deflate-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     *\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.DeflateCompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.deflate.DeflateParameters)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Creates a new input stream that decompresses Deflate-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     * @param       parameters parameters\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read()",
      "begin_line": 59,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 28)",
        "(line 62,col 9)-(line 62,col 33)",
        "(line 63,col 9)-(line 63,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read(byte[], int, int)",
      "begin_line": 67,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 41)",
        "(line 70,col 9)-(line 70,col 19)",
        "(line 71,col 9)-(line 71,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.skip(long)",
      "begin_line": 75,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.available()",
      "begin_line": 81,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.close()",
      "begin_line": 87,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)"
      ]
    }
  ]
}