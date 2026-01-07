{
  "filepath": "/tmp/Compress-33b/src/test/java/org/apache/commons/compress/archivers/zip/UTF8ZipFilesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UTF8ZipFilesTest",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 36,
      "end_line": 407,
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
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSExplicitUnicodeExtra()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testCP437FileRoundtripExplicitUnicodeExtra()",
      "begin_line": 55,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testASCIIFileRoundtripExplicitUnicodeExtra()",
      "begin_line": 61,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripImplicitUnicodeExtra()",
      "begin_line": 67,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8FileRoundtripNoEFSImplicitUnicodeExtra()",
      "begin_line": 73,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testCP437FileRoundtripImplicitUnicodeExtra()",
      "begin_line": 79,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testASCIIFileRoundtripImplicitUnicodeExtra()",
      "begin_line": 85,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRead7ZipArchive()",
      "begin_line": 97,
      "end_line": 109,
      "comment": "\n     * 7-ZIP created archive, uses EFS to signal UTF-8 filenames.\n     *\n     * 7-ZIP doesn\u0027t use EFS for strings that can be encoded in CP437\n     * - which is true for OIL_BARREL_TXT.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 53)",
        "(line 100,col 9)-(line 100,col 26)",
        "(line 101,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRead7ZipArchiveForStream()",
      "begin_line": 111,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 114,col 63)",
        "(line 115,col 9)-(line 115,col 40)",
        "(line 116,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testReadWinZipArchive()",
      "begin_line": 132,
      "end_line": 144,
      "comment": "\n     * WinZIP created archive, uses Unicode Extra Fields but only in\n     * the central directory.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 55)",
        "(line 135,col 9)-(line 135,col 26)",
        "(line 136,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertCanRead(org.apache.commons.compress.archivers.zip.ZipFile, java.lang.String)",
      "begin_line": 146,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 54)",
        "(line 148,col 9)-(line 148,col 52)",
        "(line 149,col 9)-(line 149,col 50)",
        "(line 150,col 9)-(line 150,col 49)",
        "(line 151,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testReadWinZipArchiveForStream()",
      "begin_line": 158,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 161,col 65)",
        "(line 162,col 9)-(line 162,col 40)",
        "(line 163,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testZipFileReadsUnicodeFields()",
      "begin_line": 175,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 64)",
        "(line 178,col 9)-(line 178,col 28)",
        "(line 179,col 9)-(line 179,col 40)",
        "(line 180,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testZipArchiveInputStreamReadsUnicodeFields()",
      "begin_line": 195,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 64)",
        "(line 199,col 9)-(line 199,col 28)",
        "(line 200,col 9)-(line 200,col 26)",
        "(line 201,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRawNameReadFromZipFile()",
      "begin_line": 213,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 53)",
        "(line 217,col 9)-(line 217,col 26)",
        "(line 218,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testRawNameReadFromStream()",
      "begin_line": 226,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 230,col 63)",
        "(line 231,col 9)-(line 231,col 40)",
        "(line 232,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFileRoundtrip(java.lang.String, boolean, boolean)",
      "begin_line": 242,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 68)",
        "(line 247,col 9)-(line 247,col 28)",
        "(line 248,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.createTestFile(java.io.File, java.lang.String, boolean, boolean)",
      "begin_line": 256,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 77)",
        "(line 263,col 9)-(line 263,col 42)",
        "(line 264,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testFile(java.io.File, java.lang.String)",
      "begin_line": 336,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 26)",
        "(line 339,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.findUniCodePath(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 363,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertUnicodeName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.lang.String, java.lang.String)",
      "begin_line": 366,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.testUtf8Interoperability()",
      "begin_line": 387,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 51)",
        "(line 390,col 9)-(line 390,col 53)",
        "(line 392,col 9)-(line 392,col 30)",
        "(line 393,col 9)-(line 393,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UTF8ZipFilesTest.assertRawNameOfAcsiiTxt(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 397,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 35)",
        "(line 399,col 9)-(line 399,col 25)",
        "(line 400,col 9)-(line 400,col 43)",
        "(line 401,col 9)-(line 401,col 36)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 42)"
      ]
    }
  ]
}