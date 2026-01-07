{
  "filepath": "/tmp/Compress-31b/src/test/java/org/apache/commons/compress/compressors/DetectCompressorTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DetectCompressorTestCase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factoryTrue"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factoryFalse"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factorySetTrue"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Must be static to allow use in the TestData entries"
    },
    {
      "type": "field",
      "varNames": [
        "factorySetFalse"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The multiple file name"
    },
    {
      "type": "field",
      "varNames": [
        "entryNames"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " expected entries ..."
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " ... when using this factory"
    },
    {
      "type": "field",
      "varNames": [
        "concat"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " expected value for decompressConcatenated"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.TestData.TestData(java.lang.String, char[], org.apache.commons.compress.compressors.CompressorStreamFactory, boolean)",
      "begin_line": 61,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 33)",
        "(line 63,col 13)-(line 63,col 36)",
        "(line 64,col 13)-(line 64,col 35)",
        "(line 65,col 13)-(line 65,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tests"
      ],
      "begin_line": 69,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testDetection()",
      "begin_line": 89,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 66)",
        "(line 92,col 9)-(line 92,col 29)",
        "(line 93,col 9)-(line 93,col 64)",
        "(line 95,col 9)-(line 95,col 61)",
        "(line 96,col 9)-(line 96,col 28)",
        "(line 97,col 9)-(line 97,col 62)",
        "(line 99,col 9)-(line 99,col 65)",
        "(line 100,col 9)-(line 100,col 31)",
        "(line 101,col 9)-(line 101,col 68)",
        "(line 103,col 9)-(line 103,col 62)",
        "(line 104,col 9)-(line 104,col 26)",
        "(line 105,col 9)-(line 105,col 58)",
        "(line 107,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testOverride()",
      "begin_line": 115,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 68)",
        "(line 118,col 9)-(line 118,col 53)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 52)",
        "(line 122,col 9)-(line 122,col 49)",
        "(line 123,col 9)-(line 123,col 53)",
        "(line 124,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 48)",
        "(line 132,col 9)-(line 132,col 52)",
        "(line 133,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testMutiples()",
      "begin_line": 141,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String)",
      "begin_line": 158,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String, org.apache.commons.compress.compressors.CompressorStreamFactory)",
      "begin_line": 165,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 44)"
      ]
    }
  ]
}