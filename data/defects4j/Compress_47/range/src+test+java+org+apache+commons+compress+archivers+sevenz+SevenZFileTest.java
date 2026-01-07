{
  "filepath": "/tmp/Compress-47b/src/test/java/org/apache/commons/compress/archivers/sevenz/SevenZFileTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZFileTest",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 41,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEST2_CONTENT"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.testRandomlySkippingEntries()",
      "begin_line": 46,
      "end_line": 96,
      "comment": " https://issues.apache.org/jira/browse/COMPRESS-320",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 66)",
        "(line 50,col 9)-(line 50,col 77)",
        "(line 51,col 9)-(line 51,col 33)",
        "(line 52,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 24)",
        "(line 59,col 9)-(line 73,col 10)",
        "(line 76,col 9)-(line 76,col 50)",
        "(line 77,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.readFully(org.apache.commons.compress.archivers.sevenz.SevenZFile)",
      "begin_line": 98,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 44)",
        "(line 100,col 9)-(line 100,col 71)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.testAllEmptyFilesArchive()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.testHelloWorldHeaderCompressionOffCopy()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.testHelloWorldHeaderCompressionOffLZMA2()",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.test7zUnarchive()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.test7zDeflateUnarchive()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.test7zDeflate64Unarchive()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.test7zDecryptUnarchive()",
      "begin_line": 139,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.test7zUnarchive(java.io.File, org.apache.commons.compress.archivers.sevenz.SevenZMethod)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.testEncryptedArchiveRequiresPassword()",
      "begin_line": 151,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.testCompressedHeaderWithNonDefaultDictionarySize()",
      "begin_line": 170,
      "end_line": 179,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-256\"\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.testSignatureCheck()",
      "begin_line": 181,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 184,col 74)",
        "(line 185,col 9)-(line 186,col 78)",
        "(line 187,col 9)-(line 188,col 78)",
        "(line 189,col 9)-(line 189,col 76)",
        "(line 190,col 9)-(line 191,col 81)",
        "(line 192,col 9)-(line 193,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.testReadingBackLZMA2DictSize()",
      "begin_line": 196,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 63)",
        "(line 199,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.testReadingBackDeltaDistance()",
      "begin_line": 216,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 63)",
        "(line 219,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.getEntriesOfUnarchiveTest()",
      "begin_line": 237,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.getEntriesOfUnarchiveInMemoryTest()",
      "begin_line": 250,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 27)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.readEntriesOfSize0()",
      "begin_line": 270,
      "end_line": 287,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-348\"\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 286,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.test7zUnarchive(java.io.File, org.apache.commons.compress.archivers.sevenz.SevenZMethod, byte[])",
      "begin_line": 289,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 306,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.checkHelloWorld(java.lang.String)",
      "begin_line": 309,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFileTest.isStrongCryptoAvailable()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 76)"
      ]
    }
  ]
}