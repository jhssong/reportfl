{
  "filepath": "/tmp/Compress-38b/src/test/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtraFieldUtilsTest",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.UnixStat"
      ],
      "begin_line": 30,
      "end_line": 208,
      "comment": "\n * JUnit testcases for org.apache.commons.compress.archivers.zip.ExtraFieldUtils.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNRECOGNIZED_HEADER"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Header-ID of a ZipExtraField not supported by Commons Compress.\n     *\n     * \u003cp\u003eUsed to be ZipShort(1) but this is the ID of the Zip64 extra\n     * field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dummy"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aLocal"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtilsTest.setUp()",
      "begin_line": 45,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 32)",
        "(line 48,col 9)-(line 48,col 24)",
        "(line 49,col 9)-(line 49,col 29)",
        "(line 50,col 9)-(line 50,col 45)",
        "(line 51,col 9)-(line 51,col 47)",
        "(line 52,col 9)-(line 52,col 51)",
        "(line 53,col 9)-(line 53,col 54)",
        "(line 55,col 9)-(line 55,col 42)",
        "(line 56,col 9)-(line 56,col 63)",
        "(line 57,col 9)-(line 57,col 67)",
        "(line 58,col 9)-(line 58,col 68)",
        "(line 59,col 9)-(line 59,col 79)",
        "(line 60,col 9)-(line 60,col 60)",
        "(line 61,col 9)-(line 62,col 45)",
        "(line 63,col 9)-(line 64,col 47)",
        "(line 65,col 9)-(line 66,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtilsTest.testParse()",
      "begin_line": 73,
      "end_line": 95,
      "comment": "\n     * test parser.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 63)",
        "(line 76,col 9)-(line 76,col 55)",
        "(line 77,col 9)-(line 77,col 67)",
        "(line 78,col 9)-(line 79,col 56)",
        "(line 80,col 9)-(line 80,col 76)",
        "(line 81,col 9)-(line 82,col 64)",
        "(line 84,col 9)-(line 84,col 53)",
        "(line 85,col 9)-(line 85,col 58)",
        "(line 86,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtilsTest.testParseWithRead()",
      "begin_line": 97,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 78)",
        "(line 102,col 9)-(line 102,col 55)",
        "(line 103,col 9)-(line 103,col 67)",
        "(line 104,col 9)-(line 105,col 56)",
        "(line 106,col 9)-(line 106,col 76)",
        "(line 107,col 9)-(line 108,col 64)",
        "(line 110,col 9)-(line 110,col 53)",
        "(line 111,col 9)-(line 111,col 58)",
        "(line 112,col 9)-(line 113,col 79)",
        "(line 114,col 9)-(line 114,col 55)",
        "(line 115,col 9)-(line 115,col 67)",
        "(line 116,col 9)-(line 117,col 56)",
        "(line 118,col 9)-(line 118,col 79)",
        "(line 119,col 9)-(line 120,col 64)",
        "(line 121,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtilsTest.testParseWithSkip()",
      "begin_line": 128,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 78)",
        "(line 133,col 9)-(line 133,col 55)",
        "(line 134,col 9)-(line 134,col 67)",
        "(line 135,col 9)-(line 136,col 56)",
        "(line 137,col 9)-(line 137,col 76)",
        "(line 138,col 9)-(line 139,col 64)",
        "(line 141,col 9)-(line 141,col 53)",
        "(line 142,col 9)-(line 142,col 58)",
        "(line 143,col 9)-(line 144,col 79)",
        "(line 145,col 9)-(line 145,col 55)",
        "(line 146,col 9)-(line 146,col 67)",
        "(line 147,col 9)-(line 148,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtilsTest.testMerge()",
      "begin_line": 154,
      "end_line": 179,
      "comment": "\n     * Test merge methods\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 157,col 83)",
        "(line 158,col 9)-(line 158,col 64)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 68)",
        "(line 164,col 9)-(line 164,col 83)",
        "(line 165,col 9)-(line 165,col 67)",
        "(line 166,col 9)-(line 167,col 54)",
        "(line 168,col 9)-(line 169,col 65)",
        "(line 172,col 9)-(line 173,col 86)",
        "(line 174,col 9)-(line 174,col 69)",
        "(line 175,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtilsTest.testMergeWithUnparseableData()",
      "begin_line": 181,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 64)",
        "(line 184,col 9)-(line 184,col 56)",
        "(line 185,col 9)-(line 185,col 70)",
        "(line 186,col 9)-(line 187,col 79)",
        "(line 188,col 9)-(line 188,col 68)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 60)",
        "(line 194,col 9)-(line 194,col 75)",
        "(line 195,col 9)-(line 195,col 67)",
        "(line 196,col 9)-(line 197,col 61)",
        "(line 200,col 9)-(line 201,col 82)",
        "(line 202,col 9)-(line 202,col 69)",
        "(line 203,col 9)-(line 205,col 9)"
      ]
    }
  ]
}