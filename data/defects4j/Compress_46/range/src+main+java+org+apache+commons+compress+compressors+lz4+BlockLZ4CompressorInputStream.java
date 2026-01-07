{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/compressors/lz4/BlockLZ4CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockLZ4CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream"
      ],
      "begin_line": 34,
      "end_line": 147,
      "comment": "\n * CompressorInputStream for the LZ4 block format.\n *\n * @see \u003ca href\u003d\"http://lz4.github.io/lz4/lz4_Block_format.html\"\u003eLZ4 Block Format Description\u003c/a\u003e\n * @since 1.14\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "WINDOW_SIZE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_BITS"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BACK_REFERENCE_SIZE_MASK"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LITERAL_SIZE_MASK"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextBackReferenceSize"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Back-Reference-size part of the block starting byte. "
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Current state of the stream "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.BlockLZ4CompressorInputStream(java.io.InputStream)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Creates a new LZ4 input stream.\n     *\n     * @param is\n     *            An InputStream to read compressed data from\n     *\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.read(byte[], int, int)",
      "begin_line": 62,
      "end_line": 91,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.readSizes()",
      "begin_line": 93,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 38)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 69)",
        "(line 99,col 9)-(line 99,col 76)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 38)",
        "(line 104,col 9)-(line 104,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.readSizeBytes()",
      "begin_line": 107,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 23)",
        "(line 109,col 9)-(line 109,col 21)",
        "(line 110,col 9)-(line 116,col 34)",
        "(line 117,col 9)-(line 117,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.initializeBackReference()",
      "begin_line": 124,
      "end_line": 142,
      "comment": "\n     * @return false if there is no more back-reference - this means this is the\n     * last block of the stream.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 36)",
        "(line 126,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 55)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 71)",
        "(line 140,col 9)-(line 140,col 40)",
        "(line 141,col 9)-(line 141,col 20)"
      ]
    }
  ]
}