{
  "filepath": "/tmp/Compress-43b/src/test/java/org/apache/commons/compress/compressors/DetectCompressorTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DetectCompressorTestCase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 279,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factoryTrue"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factoryFalse"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factorySetTrue"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Must be static to allow use in the TestData entries"
    },
    {
      "type": "field",
      "varNames": [
        "factorySetFalse"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The multiple file name"
    },
    {
      "type": "field",
      "varNames": [
        "entryNames"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " expected entries ..."
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " ... when using this factory"
    },
    {
      "type": "field",
      "varNames": [
        "concat"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " expected value for decompressConcatenated"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.TestData.TestData(java.lang.String, char[], org.apache.commons.compress.compressors.CompressorStreamFactory, boolean)",
      "begin_line": 66,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 33)",
        "(line 68,col 13)-(line 68,col 36)",
        "(line 69,col 13)-(line 69,col 35)",
        "(line 70,col 13)-(line 70,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tests"
      ],
      "begin_line": 74,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testDetection()",
      "begin_line": 94,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 72)",
        "(line 97,col 9)-(line 97,col 29)",
        "(line 98,col 9)-(line 98,col 64)",
        "(line 100,col 9)-(line 100,col 67)",
        "(line 101,col 9)-(line 101,col 28)",
        "(line 102,col 9)-(line 102,col 62)",
        "(line 104,col 9)-(line 104,col 71)",
        "(line 105,col 9)-(line 105,col 31)",
        "(line 106,col 9)-(line 106,col 68)",
        "(line 108,col 9)-(line 108,col 68)",
        "(line 109,col 9)-(line 109,col 26)",
        "(line 110,col 9)-(line 110,col 58)",
        "(line 112,col 9)-(line 112,col 76)",
        "(line 113,col 9)-(line 113,col 28)",
        "(line 114,col 9)-(line 114,col 65)",
        "(line 116,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testDetect()",
      "begin_line": 124,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 75)",
        "(line 128,col 9)-(line 128,col 70)",
        "(line 129,col 9)-(line 129,col 74)",
        "(line 130,col 9)-(line 130,col 71)",
        "(line 131,col 9)-(line 131,col 82)",
        "(line 132,col 9)-(line 132,col 80)",
        "(line 133,col 9)-(line 133,col 75)",
        "(line 134,col 9)-(line 134,col 82)",
        "(line 135,col 9)-(line 135,col 69)",
        "(line 138,col 9)-(line 138,col 72)",
        "(line 139,col 9)-(line 139,col 75)",
        "(line 141,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.detect(java.lang.String)",
      "begin_line": 165,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 27)",
        "(line 167,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testLZMAMemoryLimit()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testZMemoryLimit()",
      "begin_line": 179,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testXZMemoryLimitOnRead()",
      "begin_line": 184,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testXZMemoryLimitOnSkip()",
      "begin_line": 197,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String, int)",
      "begin_line": 204,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 206,col 33)",
        "(line 207,col 9)-(line 208,col 56)",
        "(line 209,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testOverride()",
      "begin_line": 223,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 68)",
        "(line 226,col 9)-(line 226,col 53)",
        "(line 227,col 9)-(line 227,col 44)",
        "(line 228,col 9)-(line 228,col 52)",
        "(line 230,col 9)-(line 230,col 49)",
        "(line 231,col 9)-(line 231,col 53)",
        "(line 232,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 48)",
        "(line 240,col 9)-(line 240,col 52)",
        "(line 241,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.testMutiples()",
      "begin_line": 249,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String)",
      "begin_line": 266,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.DetectCompressorTestCase.getStreamFor(java.lang.String, org.apache.commons.compress.compressors.CompressorStreamFactory)",
      "begin_line": 273,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 44)"
      ]
    }
  ]
}