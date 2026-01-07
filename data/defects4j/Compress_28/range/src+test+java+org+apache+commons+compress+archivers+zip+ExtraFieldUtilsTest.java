{
  "filepath": "/tmp/Compress-28b/src/test/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtraFieldUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase",
        "org.apache.commons.compress.archivers.zip.UnixStat"
      ],
      "begin_line": 27,
      "end_line": 203,
      "comment": "\n * JUnit 3 testcases for org.apache.commons.compress.archivers.zip.ExtraFieldUtils.\n *\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtilsTest.ExtraFieldUtilsTest(java.lang.String)",
      "begin_line": 28,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 20)"
      ]
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
        "(line 56,col 9)-(line 56,col 57)",
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
      "end_line": 94,
      "comment": "\n     * test parser.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 57)",
        "(line 75,col 9)-(line 75,col 55)",
        "(line 76,col 9)-(line 76,col 67)",
        "(line 77,col 9)-(line 78,col 56)",
        "(line 79,col 9)-(line 79,col 76)",
        "(line 80,col 9)-(line 81,col 64)",
        "(line 83,col 9)-(line 83,col 47)",
        "(line 84,col 9)-(line 84,col 58)",
        "(line 85,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtilsTest.testParseWithRead()",
      "begin_line": 96,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 78)",
        "(line 100,col 9)-(line 100,col 55)",
        "(line 101,col 9)-(line 101,col 67)",
        "(line 102,col 9)-(line 103,col 56)",
        "(line 104,col 9)-(line 104,col 76)",
        "(line 105,col 9)-(line 106,col 64)",
        "(line 108,col 9)-(line 108,col 47)",
        "(line 109,col 9)-(line 109,col 58)",
        "(line 110,col 9)-(line 111,col 79)",
        "(line 112,col 9)-(line 112,col 55)",
        "(line 113,col 9)-(line 113,col 67)",
        "(line 114,col 9)-(line 115,col 56)",
        "(line 116,col 9)-(line 116,col 79)",
        "(line 117,col 9)-(line 118,col 64)",
        "(line 119,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtilsTest.testParseWithSkip()",
      "begin_line": 126,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 78)",
        "(line 130,col 9)-(line 130,col 55)",
        "(line 131,col 9)-(line 131,col 67)",
        "(line 132,col 9)-(line 133,col 56)",
        "(line 134,col 9)-(line 134,col 76)",
        "(line 135,col 9)-(line 136,col 64)",
        "(line 138,col 9)-(line 138,col 47)",
        "(line 139,col 9)-(line 139,col 58)",
        "(line 140,col 9)-(line 141,col 79)",
        "(line 142,col 9)-(line 142,col 55)",
        "(line 143,col 9)-(line 143,col 67)",
        "(line 144,col 9)-(line 145,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtilsTest.testMerge()",
      "begin_line": 151,
      "end_line": 175,
      "comment": "\n     * Test merge methods\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 153,col 83)",
        "(line 154,col 9)-(line 154,col 64)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 62)",
        "(line 160,col 9)-(line 160,col 77)",
        "(line 161,col 9)-(line 161,col 67)",
        "(line 162,col 9)-(line 163,col 54)",
        "(line 164,col 9)-(line 165,col 65)",
        "(line 168,col 9)-(line 169,col 86)",
        "(line 170,col 9)-(line 170,col 69)",
        "(line 171,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtilsTest.testMergeWithUnparseableData()",
      "begin_line": 177,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 58)",
        "(line 179,col 9)-(line 179,col 50)",
        "(line 180,col 9)-(line 180,col 70)",
        "(line 181,col 9)-(line 182,col 79)",
        "(line 183,col 9)-(line 183,col 68)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 54)",
        "(line 189,col 9)-(line 189,col 69)",
        "(line 190,col 9)-(line 190,col 67)",
        "(line 191,col 9)-(line 192,col 61)",
        "(line 195,col 9)-(line 196,col 82)",
        "(line 197,col 9)-(line 197,col 69)",
        "(line 198,col 9)-(line 200,col 9)"
      ]
    }
  ]
}