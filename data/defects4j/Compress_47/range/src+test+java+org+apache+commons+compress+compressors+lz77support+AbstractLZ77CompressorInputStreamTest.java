{
  "filepath": "/tmp/Compress-47b/src/test/java/org/apache/commons/compress/compressors/lz77support/AbstractLZ77CompressorInputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLZ77CompressorInputStreamTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TestStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream"
      ],
      "begin_line": 32,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "literal"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStreamTest.TestStream.TestStream(java.io.InputStream)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 13)-(line 35,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStreamTest.TestStream.read(byte[], int, int)",
      "begin_line": 37,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 39,col 13)-(line 41,col 13)",
        "(line 42,col 13)-(line 42,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStreamTest.TestStream.literal(int)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 45,col 13)-(line 45,col 30)",
        "(line 46,col 13)-(line 46,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStreamTest.cantPrefillAfterDataHasBeenRead()",
      "begin_line": 50,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 48)",
        "(line 53,col 9)-(line 57,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStreamTest.prefillCanBeUsedForBackReferences()",
      "begin_line": 60,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 48)",
        "(line 63,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStreamTest.ifPrefillExceedsWindowSizeTheLastBytesAreUsed()",
      "begin_line": 72,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 37)",
        "(line 75,col 9)-(line 75,col 23)",
        "(line 76,col 9)-(line 76,col 23)",
        "(line 77,col 9)-(line 83,col 9)"
      ]
    }
  ]
}