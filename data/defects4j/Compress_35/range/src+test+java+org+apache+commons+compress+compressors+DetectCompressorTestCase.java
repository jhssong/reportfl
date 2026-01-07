{
  "filepath": "/tmp/Compress-35b/src/test/java/org/apache/commons/compress/compressors/DetectCompressorTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DetectCompressorTestCase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factoryTrue"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factoryFalse"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factorySetTrue"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Must be static to allow use in the TestData entries"
    },
    {
      "type": "field",
      "varNames": [
        "factorySetFalse"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The multiple file name"
    },
    {
      "type": "field",
      "varNames": [
        "entryNames"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " expected entries ..."
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " ... when using this factory"
    },
    {
      "type": "field",
      "varNames": [
        "concat"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " expected value for decompressConcatenated"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.TestData.TestData(java.lang.String, char[], org.apache.commons.compress.compressors.CompressorStreamFactory, boolean)",
      "begin_line": 62,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 33)",
        "(line 64,col 13)-(line 64,col 36)",
        "(line 65,col 13)-(line 65,col 35)",
        "(line 66,col 13)-(line 66,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tests"
      ],
      "begin_line": 70,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testDetection()",
      "begin_line": 90,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 66)",
        "(line 93,col 9)-(line 93,col 29)",
        "(line 94,col 9)-(line 94,col 64)",
        "(line 96,col 9)-(line 96,col 61)",
        "(line 97,col 9)-(line 97,col 28)",
        "(line 98,col 9)-(line 98,col 62)",
        "(line 100,col 9)-(line 100,col 65)",
        "(line 101,col 9)-(line 101,col 31)",
        "(line 102,col 9)-(line 102,col 68)",
        "(line 104,col 9)-(line 104,col 62)",
        "(line 105,col 9)-(line 105,col 26)",
        "(line 106,col 9)-(line 106,col 58)",
        "(line 108,col 9)-(line 108,col 70)",
        "(line 109,col 9)-(line 109,col 28)",
        "(line 110,col 9)-(line 110,col 65)",
        "(line 112,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testOverride()",
      "begin_line": 120,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 68)",
        "(line 123,col 9)-(line 123,col 53)",
        "(line 124,col 9)-(line 124,col 44)",
        "(line 125,col 9)-(line 125,col 52)",
        "(line 127,col 9)-(line 127,col 49)",
        "(line 128,col 9)-(line 128,col 53)",
        "(line 129,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 48)",
        "(line 137,col 9)-(line 137,col 52)",
        "(line 138,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testMutiples()",
      "begin_line": 146,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String)",
      "begin_line": 163,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String, org.apache.commons.compress.compressors.CompressorStreamFactory)",
      "begin_line": 170,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 44)"
      ]
    }
  ]
}