{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/compressors/deflate64/Deflate64CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Deflate64CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 31,
      "end_line": 104,
      "comment": "\n * Deflate64 decompressor.\n *\n * @since 1.16\n "
    },
    {
      "type": "field",
      "varNames": [
        "originalStream"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "decoder"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream.Deflate64CompressorInputStream(java.io.InputStream)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     * Constructs a Deflate64CompressorInputStream.\n     *\n     * @param in the stream to read from\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 37)",
        "(line 42,col 9)-(line 42,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream.Deflate64CompressorInputStream(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream.read()",
      "begin_line": 52,
      "end_line": 68,
      "comment": "\n     * @throws java.io.EOFException if the underlying stream is exhausted before the end of defalted data was reached.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 31)",
        "(line 55,col 9)-(line 67,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream.read(byte[], int, int)",
      "begin_line": 73,
      "end_line": 84,
      "comment": "\n     * @throws java.io.EOFException if the underlying stream is exhausted before the end of defalted data was reached.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 22)",
        "(line 76,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream.available()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream.close()",
      "begin_line": 91,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 23)",
        "(line 94,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream.closeDecoder()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 30)",
        "(line 102,col 9)-(line 102,col 23)"
      ]
    }
  ]
}