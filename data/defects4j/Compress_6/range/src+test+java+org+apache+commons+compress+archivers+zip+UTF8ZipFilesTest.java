{
  "filepath": "/tmp/Compress-6b/src/test/java/org/apache/commons/compress/archivers/zip/UTF8ZipFilesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UTF8ZipFilesTest",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 34,
      "end_line": 346,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UTF_8"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CP437"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "US_ASCII"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_TXT"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EURO_FOR_DOLLAR_TXT"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OIL_BARREL_TXT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripExplicitUnicodeExtra()",
      "begin_line": 43,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSExplicitUnicodeExtra()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testCP437FileRoundtripExplicitUnicodeExtra()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testASCIIFileRoundtripExplicitUnicodeExtra()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripImplicitUnicodeExtra()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSImplicitUnicodeExtra()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testCP437FileRoundtripImplicitUnicodeExtra()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testASCIIFileRoundtripImplicitUnicodeExtra()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRead7ZipArchive()",
      "begin_line": 89,
      "end_line": 101,
      "comment": "\n     * 7-ZIP created archive, uses EFS to signal UTF-8 filenames.\n     *\n     * 7-ZIP doesn\u0027t use EFS for strings that can be encoded in CP437\n     * - which is true for OIL_BARREL_TXT.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 64)",
        "(line 91,col 9)-(line 91,col 57)",
        "(line 92,col 9)-(line 92,col 26)",
        "(line 93,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRead7ZipArchiveForStream()",
      "begin_line": 103,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 64)",
        "(line 106,col 9)-(line 107,col 67)",
        "(line 108,col 9)-(line 108,col 40)",
        "(line 109,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testReadWinZipArchive()",
      "begin_line": 125,
      "end_line": 137,
      "comment": "\n     * WinZIP created archive, uses Unicode Extra Fields but only in\n     * the central directory.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 66)",
        "(line 127,col 9)-(line 127,col 57)",
        "(line 128,col 9)-(line 128,col 26)",
        "(line 129,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testReadWinZipArchiveForStream()",
      "begin_line": 139,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 66)",
        "(line 142,col 9)-(line 143,col 67)",
        "(line 144,col 9)-(line 144,col 40)",
        "(line 145,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testZipFileReadsUnicodeFields()",
      "begin_line": 157,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 64)",
        "(line 159,col 9)-(line 159,col 40)",
        "(line 160,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testZipArchiveInputStreamReadsUnicodeFields()",
      "begin_line": 177,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 64)",
        "(line 180,col 9)-(line 180,col 26)",
        "(line 181,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFileRoundtrip(java.lang.String, boolean, boolean)",
      "begin_line": 195,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 68)",
        "(line 200,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.createTestFile(java.io.File, java.lang.String, boolean, boolean)",
      "begin_line": 210,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 77)",
        "(line 217,col 9)-(line 217,col 42)",
        "(line 218,col 9)-(line 284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFile(java.io.File, java.lang.String)",
      "begin_line": 287,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 26)",
        "(line 290,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.findUniCodePath(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 312,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 314,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertUnicodeName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.lang.String, java.lang.String)",
      "begin_line": 317,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8Interoperability()",
      "begin_line": 337,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 57)",
        "(line 339,col 9)-(line 339,col 59)",
        "(line 341,col 9)-(line 341,col 30)",
        "(line 342,col 9)-(line 342,col 30)"
      ]
    }
  ]
}