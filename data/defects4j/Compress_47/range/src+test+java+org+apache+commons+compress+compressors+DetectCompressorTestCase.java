{
  "filepath": "/tmp/Compress-47b/src/test/java/org/apache/commons/compress/compressors/DetectCompressorTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DetectCompressorTestCase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factoryTrue"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factoryFalse"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factorySetTrue"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Must be static to allow use in the TestData entries"
    },
    {
      "type": "field",
      "varNames": [
        "factorySetFalse"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The multiple file name"
    },
    {
      "type": "field",
      "varNames": [
        "entryNames"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " expected entries ..."
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " ... when using this factory"
    },
    {
      "type": "field",
      "varNames": [
        "concat"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " expected value for decompressConcatenated"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.TestData.TestData(java.lang.String, char[], org.apache.commons.compress.compressors.CompressorStreamFactory, boolean)",
      "begin_line": 67,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 68,col 33)",
        "(line 69,col 13)-(line 69,col 36)",
        "(line 70,col 13)-(line 70,col 35)",
        "(line 71,col 13)-(line 71,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tests"
      ],
      "begin_line": 75,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testDetection()",
      "begin_line": 95,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 72)",
        "(line 98,col 9)-(line 98,col 29)",
        "(line 99,col 9)-(line 99,col 64)",
        "(line 101,col 9)-(line 101,col 67)",
        "(line 102,col 9)-(line 102,col 28)",
        "(line 103,col 9)-(line 103,col 62)",
        "(line 105,col 9)-(line 105,col 71)",
        "(line 106,col 9)-(line 106,col 31)",
        "(line 107,col 9)-(line 107,col 68)",
        "(line 109,col 9)-(line 109,col 68)",
        "(line 110,col 9)-(line 110,col 26)",
        "(line 111,col 9)-(line 111,col 58)",
        "(line 113,col 9)-(line 113,col 76)",
        "(line 114,col 9)-(line 114,col 28)",
        "(line 115,col 9)-(line 115,col 65)",
        "(line 117,col 9)-(line 117,col 71)",
        "(line 118,col 9)-(line 118,col 28)",
        "(line 119,col 9)-(line 119,col 62)",
        "(line 121,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testDetect()",
      "begin_line": 129,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 75)",
        "(line 133,col 9)-(line 133,col 70)",
        "(line 134,col 9)-(line 134,col 74)",
        "(line 135,col 9)-(line 135,col 71)",
        "(line 136,col 9)-(line 136,col 82)",
        "(line 137,col 9)-(line 137,col 80)",
        "(line 138,col 9)-(line 138,col 75)",
        "(line 139,col 9)-(line 139,col 82)",
        "(line 140,col 9)-(line 140,col 69)",
        "(line 141,col 9)-(line 141,col 79)",
        "(line 144,col 9)-(line 144,col 72)",
        "(line 145,col 9)-(line 145,col 75)",
        "(line 147,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.detect(java.lang.String)",
      "begin_line": 171,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 27)",
        "(line 173,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testLZMAMemoryLimit()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testZMemoryLimit()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testXZMemoryLimitOnRead()",
      "begin_line": 190,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testXZMemoryLimitOnSkip()",
      "begin_line": 203,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String, int)",
      "begin_line": 210,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 212,col 33)",
        "(line 213,col 9)-(line 214,col 56)",
        "(line 215,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testOverride()",
      "begin_line": 229,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 68)",
        "(line 232,col 9)-(line 232,col 53)",
        "(line 233,col 9)-(line 233,col 44)",
        "(line 234,col 9)-(line 234,col 52)",
        "(line 236,col 9)-(line 236,col 49)",
        "(line 237,col 9)-(line 237,col 53)",
        "(line 238,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 48)",
        "(line 246,col 9)-(line 246,col 52)",
        "(line 247,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testMutiples()",
      "begin_line": 255,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 269,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String)",
      "begin_line": 272,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String, org.apache.commons.compress.compressors.CompressorStreamFactory)",
      "begin_line": 279,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 44)"
      ]
    }
  ]
}