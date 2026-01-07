{
  "filepath": "/tmp/Compress-1b/src/test/java/org/apache/commons/compress/archivers/zip/UTF8ZipFilesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UTF8ZipFilesTest",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 33,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UTF_8"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CP437"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "US_ASCII"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_TXT"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EURO_FOR_DOLLAR_TXT"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OIL_BARREL_TXT"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripExplicitUnicodeExtra()",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSExplicitUnicodeExtra()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testCP437FileRoundtripExplicitUnicodeExtra()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testASCIIFileRoundtripExplicitUnicodeExtra()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripImplicitUnicodeExtra()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSImplicitUnicodeExtra()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testCP437FileRoundtripImplicitUnicodeExtra()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testASCIIFileRoundtripImplicitUnicodeExtra()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRead7ZipArchive()",
      "begin_line": 88,
      "end_line": 100,
      "comment": "\n     * 7-ZIP created archive, uses EFS to signal UTF-8 filenames.\n     *\n     * 7-ZIP doesn\u0027t use EFS for strings that can be encoded in CP437\n     * - which is true for OIL_BARREL_TXT.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 64)",
        "(line 90,col 9)-(line 90,col 57)",
        "(line 91,col 9)-(line 91,col 26)",
        "(line 92,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testReadWinZipArchive()",
      "begin_line": 106,
      "end_line": 118,
      "comment": "\n     * WinZIP created archive, uses Unicode Extra Fields but only in\n     * the central directory.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 66)",
        "(line 108,col 9)-(line 108,col 57)",
        "(line 109,col 9)-(line 109,col 26)",
        "(line 110,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testZipFileReadsUnicodeFields()",
      "begin_line": 120,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 64)",
        "(line 122,col 9)-(line 122,col 26)",
        "(line 123,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFileRoundtrip(java.lang.String, boolean, boolean)",
      "begin_line": 137,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 68)",
        "(line 142,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.createTestFile(java.io.File, java.lang.String, boolean, boolean)",
      "begin_line": 152,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 77)",
        "(line 159,col 9)-(line 159,col 42)",
        "(line 160,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFile(java.io.File, java.lang.String)",
      "begin_line": 227,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 26)",
        "(line 230,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.findUniCodePath(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 254,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertUnicodeName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.lang.String, java.lang.String)",
      "begin_line": 257,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8Interoperability()",
      "begin_line": 277,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 57)",
        "(line 279,col 9)-(line 279,col 59)",
        "(line 281,col 9)-(line 281,col 30)",
        "(line 282,col 9)-(line 282,col 30)"
      ]
    }
  ]
}