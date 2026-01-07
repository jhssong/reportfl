{
  "filepath": "/tmp/Compress-29b/src/test/java/org/apache/commons/compress/compressors/DetectCompressorTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DetectCompressorTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.DetectCompressorTestCase(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factoryTrue"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factoryFalse"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factorySetTrue"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Must be static to allow use in the TestData entries"
    },
    {
      "type": "field",
      "varNames": [
        "factorySetFalse"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The multiple file name"
    },
    {
      "type": "field",
      "varNames": [
        "entryNames"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " expected entries ..."
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " ... when using this factory"
    },
    {
      "type": "field",
      "varNames": [
        "concat"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " expected value for decompressConcatenated"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.TestData.TestData(java.lang.String, char[], org.apache.commons.compress.compressors.CompressorStreamFactory, boolean)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 33)",
        "(line 67,col 13)-(line 67,col 36)",
        "(line 68,col 13)-(line 68,col 35)",
        "(line 69,col 13)-(line 69,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tests"
      ],
      "begin_line": 73,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testDetection()",
      "begin_line": 93,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 66)",
        "(line 95,col 9)-(line 95,col 29)",
        "(line 96,col 9)-(line 96,col 64)",
        "(line 98,col 9)-(line 98,col 61)",
        "(line 99,col 9)-(line 99,col 28)",
        "(line 100,col 9)-(line 100,col 62)",
        "(line 102,col 9)-(line 102,col 65)",
        "(line 103,col 9)-(line 103,col 31)",
        "(line 104,col 9)-(line 104,col 68)",
        "(line 106,col 9)-(line 106,col 62)",
        "(line 107,col 9)-(line 107,col 26)",
        "(line 108,col 9)-(line 108,col 58)",
        "(line 110,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testOverride()",
      "begin_line": 118,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 68)",
        "(line 120,col 9)-(line 120,col 53)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 52)",
        "(line 124,col 9)-(line 124,col 49)",
        "(line 125,col 9)-(line 125,col 53)",
        "(line 126,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 48)",
        "(line 134,col 9)-(line 134,col 52)",
        "(line 135,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testMutiples()",
      "begin_line": 143,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String)",
      "begin_line": 159,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String, org.apache.commons.compress.compressors.CompressorStreamFactory)",
      "begin_line": 166,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 44)"
      ]
    }
  ]
}