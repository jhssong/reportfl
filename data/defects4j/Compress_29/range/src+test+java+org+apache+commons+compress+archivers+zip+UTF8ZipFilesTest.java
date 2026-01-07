{
  "filepath": "/tmp/Compress-29b/src/test/java/org/apache/commons/compress/archivers/zip/UTF8ZipFilesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UTF8ZipFilesTest",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 33,
      "end_line": 387,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CP437"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_TXT"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EURO_FOR_DOLLAR_TXT"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OIL_BARREL_TXT"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripExplicitUnicodeExtra()",
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSExplicitUnicodeExtra()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testCP437FileRoundtripExplicitUnicodeExtra()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testASCIIFileRoundtripExplicitUnicodeExtra()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripImplicitUnicodeExtra()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSImplicitUnicodeExtra()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testCP437FileRoundtripImplicitUnicodeExtra()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testASCIIFileRoundtripImplicitUnicodeExtra()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRead7ZipArchive()",
      "begin_line": 86,
      "end_line": 97,
      "comment": "\n     * 7-ZIP created archive, uses EFS to signal UTF-8 filenames.\n     *\n     * 7-ZIP doesn\u0027t use EFS for strings that can be encoded in CP437\n     * - which is true for OIL_BARREL_TXT.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 53)",
        "(line 88,col 9)-(line 88,col 26)",
        "(line 89,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRead7ZipArchiveForStream()",
      "begin_line": 99,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 101,col 63)",
        "(line 102,col 9)-(line 102,col 40)",
        "(line 103,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testReadWinZipArchive()",
      "begin_line": 119,
      "end_line": 130,
      "comment": "\n     * WinZIP created archive, uses Unicode Extra Fields but only in\n     * the central directory.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 55)",
        "(line 121,col 9)-(line 121,col 26)",
        "(line 122,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertCanRead(org.apache.commons.compress.archivers.zip.ZipFile, java.lang.String)",
      "begin_line": 132,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 54)",
        "(line 134,col 9)-(line 134,col 52)",
        "(line 135,col 9)-(line 135,col 50)",
        "(line 136,col 9)-(line 136,col 49)",
        "(line 137,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testReadWinZipArchiveForStream()",
      "begin_line": 144,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 146,col 65)",
        "(line 147,col 9)-(line 147,col 40)",
        "(line 148,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testZipFileReadsUnicodeFields()",
      "begin_line": 160,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 64)",
        "(line 162,col 9)-(line 162,col 28)",
        "(line 163,col 9)-(line 163,col 40)",
        "(line 164,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testZipArchiveInputStreamReadsUnicodeFields()",
      "begin_line": 179,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 64)",
        "(line 182,col 9)-(line 182,col 28)",
        "(line 183,col 9)-(line 183,col 26)",
        "(line 184,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRawNameReadFromZipFile()",
      "begin_line": 196,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 53)",
        "(line 199,col 9)-(line 199,col 26)",
        "(line 200,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRawNameReadFromStream()",
      "begin_line": 208,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 211,col 63)",
        "(line 212,col 9)-(line 212,col 40)",
        "(line 213,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFileRoundtrip(java.lang.String, boolean, boolean)",
      "begin_line": 223,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 68)",
        "(line 228,col 9)-(line 228,col 28)",
        "(line 229,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.createTestFile(java.io.File, java.lang.String, boolean, boolean)",
      "begin_line": 237,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 77)",
        "(line 244,col 9)-(line 244,col 42)",
        "(line 245,col 9)-(line 314,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFile(java.io.File, java.lang.String)",
      "begin_line": 317,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 26)",
        "(line 320,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.findUniCodePath(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 342,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 344,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertUnicodeName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.lang.String, java.lang.String)",
      "begin_line": 347,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8Interoperability()",
      "begin_line": 368,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 51)",
        "(line 370,col 9)-(line 370,col 53)",
        "(line 372,col 9)-(line 372,col 30)",
        "(line 373,col 9)-(line 373,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertRawNameOfAcsiiTxt(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 377,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 35)",
        "(line 379,col 9)-(line 379,col 25)",
        "(line 380,col 9)-(line 380,col 43)",
        "(line 381,col 9)-(line 381,col 36)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 42)"
      ]
    }
  ]
}