{
  "filepath": "/tmp/Compress-10b/src/test/java/org/apache/commons/compress/archivers/zip/UTF8ZipFilesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UTF8ZipFilesTest",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 35,
      "end_line": 395,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UTF_8"
      ],
      "begin_line": 37,
      "end_line": 37,
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
        "US_ASCII"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_TXT"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EURO_FOR_DOLLAR_TXT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OIL_BARREL_TXT"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripExplicitUnicodeExtra()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSExplicitUnicodeExtra()",
      "begin_line": 49,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testCP437FileRoundtripExplicitUnicodeExtra()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testASCIIFileRoundtripExplicitUnicodeExtra()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripImplicitUnicodeExtra()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSImplicitUnicodeExtra()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testCP437FileRoundtripImplicitUnicodeExtra()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testASCIIFileRoundtripImplicitUnicodeExtra()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRead7ZipArchive()",
      "begin_line": 90,
      "end_line": 102,
      "comment": "\n     * 7-ZIP created archive, uses EFS to signal UTF-8 filenames.\n     *\n     * 7-ZIP doesn\u0027t use EFS for strings that can be encoded in CP437\n     * - which is true for OIL_BARREL_TXT.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 64)",
        "(line 92,col 9)-(line 92,col 57)",
        "(line 93,col 9)-(line 93,col 26)",
        "(line 94,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRead7ZipArchiveForStream()",
      "begin_line": 104,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 64)",
        "(line 107,col 9)-(line 108,col 67)",
        "(line 109,col 9)-(line 109,col 40)",
        "(line 110,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testReadWinZipArchive()",
      "begin_line": 126,
      "end_line": 138,
      "comment": "\n     * WinZIP created archive, uses Unicode Extra Fields but only in\n     * the central directory.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 66)",
        "(line 128,col 9)-(line 128,col 57)",
        "(line 129,col 9)-(line 129,col 26)",
        "(line 130,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertCanRead(org.apache.commons.compress.archivers.zip.ZipFile, java.lang.String)",
      "begin_line": 140,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 54)",
        "(line 142,col 9)-(line 142,col 52)",
        "(line 143,col 9)-(line 143,col 50)",
        "(line 144,col 9)-(line 144,col 49)",
        "(line 145,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testReadWinZipArchiveForStream()",
      "begin_line": 152,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 66)",
        "(line 155,col 9)-(line 156,col 67)",
        "(line 157,col 9)-(line 157,col 40)",
        "(line 158,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testZipFileReadsUnicodeFields()",
      "begin_line": 170,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 64)",
        "(line 172,col 9)-(line 172,col 28)",
        "(line 173,col 9)-(line 173,col 40)",
        "(line 174,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testZipArchiveInputStreamReadsUnicodeFields()",
      "begin_line": 189,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 64)",
        "(line 192,col 9)-(line 192,col 28)",
        "(line 193,col 9)-(line 193,col 26)",
        "(line 194,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRawNameReadFromZipFile()",
      "begin_line": 206,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 64)",
        "(line 209,col 9)-(line 209,col 57)",
        "(line 210,col 9)-(line 210,col 26)",
        "(line 211,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRawNameReadFromStream()",
      "begin_line": 219,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 64)",
        "(line 222,col 9)-(line 223,col 67)",
        "(line 224,col 9)-(line 224,col 40)",
        "(line 225,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFileRoundtrip(java.lang.String, boolean, boolean)",
      "begin_line": 235,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 68)",
        "(line 240,col 9)-(line 240,col 28)",
        "(line 241,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.createTestFile(java.io.File, java.lang.String, boolean, boolean)",
      "begin_line": 249,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 77)",
        "(line 256,col 9)-(line 256,col 42)",
        "(line 257,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFile(java.io.File, java.lang.String)",
      "begin_line": 326,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 26)",
        "(line 329,col 9)-(line 348,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.findUniCodePath(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 351,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 353,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertUnicodeName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.lang.String, java.lang.String)",
      "begin_line": 356,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8Interoperability()",
      "begin_line": 376,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 57)",
        "(line 378,col 9)-(line 378,col 59)",
        "(line 380,col 9)-(line 380,col 30)",
        "(line 381,col 9)-(line 381,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertRawNameOfAcsiiTxt(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 385,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 35)",
        "(line 387,col 9)-(line 387,col 25)",
        "(line 388,col 9)-(line 388,col 43)",
        "(line 389,col 9)-(line 389,col 36)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 42)"
      ]
    }
  ]
}