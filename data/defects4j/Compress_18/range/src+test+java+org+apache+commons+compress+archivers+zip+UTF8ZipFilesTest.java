{
  "filepath": "/tmp/Compress-18b/src/test/java/org/apache/commons/compress/archivers/zip/UTF8ZipFilesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UTF8ZipFilesTest",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 36,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CP437"
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
        "(line 45,col 9)-(line 45,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSExplicitUnicodeExtra()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 59)"
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
        "(line 60,col 9)-(line 60,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripImplicitUnicodeExtra()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSImplicitUnicodeExtra()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 60)"
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
        "(line 80,col 9)-(line 80,col 63)"
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
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertCanRead(org.apache.commons.compress.archivers.zip.ZipFile, java.lang.String)",
      "begin_line": 139,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 54)",
        "(line 141,col 9)-(line 141,col 52)",
        "(line 142,col 9)-(line 142,col 50)",
        "(line 143,col 9)-(line 143,col 49)",
        "(line 144,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testReadWinZipArchiveForStream()",
      "begin_line": 151,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 66)",
        "(line 154,col 9)-(line 155,col 67)",
        "(line 156,col 9)-(line 156,col 40)",
        "(line 157,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testZipFileReadsUnicodeFields()",
      "begin_line": 169,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 64)",
        "(line 171,col 9)-(line 171,col 28)",
        "(line 172,col 9)-(line 172,col 40)",
        "(line 173,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testZipArchiveInputStreamReadsUnicodeFields()",
      "begin_line": 188,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 64)",
        "(line 191,col 9)-(line 191,col 28)",
        "(line 192,col 9)-(line 192,col 26)",
        "(line 193,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRawNameReadFromZipFile()",
      "begin_line": 205,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 64)",
        "(line 208,col 9)-(line 208,col 57)",
        "(line 209,col 9)-(line 209,col 26)",
        "(line 210,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRawNameReadFromStream()",
      "begin_line": 218,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 64)",
        "(line 221,col 9)-(line 222,col 67)",
        "(line 223,col 9)-(line 223,col 40)",
        "(line 224,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFileRoundtrip(java.lang.String, boolean, boolean)",
      "begin_line": 234,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 68)",
        "(line 239,col 9)-(line 239,col 28)",
        "(line 240,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.createTestFile(java.io.File, java.lang.String, boolean, boolean)",
      "begin_line": 248,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 77)",
        "(line 255,col 9)-(line 255,col 42)",
        "(line 256,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFile(java.io.File, java.lang.String)",
      "begin_line": 328,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 26)",
        "(line 331,col 9)-(line 350,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.findUniCodePath(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 353,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 355,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertUnicodeName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.lang.String, java.lang.String)",
      "begin_line": 358,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 376,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8Interoperability()",
      "begin_line": 379,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 57)",
        "(line 381,col 9)-(line 381,col 59)",
        "(line 383,col 9)-(line 383,col 30)",
        "(line 384,col 9)-(line 384,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertRawNameOfAcsiiTxt(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 388,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 35)",
        "(line 390,col 9)-(line 390,col 25)",
        "(line 391,col 9)-(line 391,col 43)",
        "(line 392,col 9)-(line 392,col 36)",
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 42)"
      ]
    }
  ]
}