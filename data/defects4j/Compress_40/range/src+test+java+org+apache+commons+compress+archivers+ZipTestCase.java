{
  "filepath": "/tmp/Compress-40b/src/test/java/org/apache/commons/compress/archivers/ZipTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 47,
      "end_line": 549,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipArchiveCreation()",
      "begin_line": 53,
      "end_line": 109,
      "comment": "\n     * Archives 2 files and unarchives it again. If the file length of result\n     * and source is the same, it looks like the operations have worked\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 53)",
        "(line 57,col 9)-(line 57,col 48)",
        "(line 58,col 9)-(line 58,col 48)",
        "(line 60,col 9)-(line 60,col 62)",
        "(line 61,col 9)-(line 61,col 38)",
        "(line 62,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 20)",
        "(line 80,col 9)-(line 80,col 53)",
        "(line 82,col 9)-(line 82,col 59)",
        "(line 83,col 9)-(line 83,col 37)",
        "(line 84,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 19)",
        "(line 104,col 9)-(line 104,col 40)",
        "(line 105,col 9)-(line 105,col 37)",
        "(line 106,col 9)-(line 106,col 54)",
        "(line 107,col 9)-(line 107,col 32)",
        "(line 108,col 9)-(line 108,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipUnarchive()",
      "begin_line": 115,
      "end_line": 125,
      "comment": "\n     * Simple unarchive test. Asserts nothing.\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 46)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 101)",
        "(line 120,col 9)-(line 120,col 73)",
        "(line 121,col 9)-(line 121,col 86)",
        "(line 122,col 9)-(line 122,col 30)",
        "(line 123,col 9)-(line 123,col 20)",
        "(line 124,col 9)-(line 124,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipsPK00Prefix()",
      "begin_line": 132,
      "end_line": 141,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 55)",
        "(line 135,col 9)-(line 135,col 55)",
        "(line 136,col 9)-(line 136,col 28)",
        "(line 137,col 9)-(line 137,col 28)",
        "(line 138,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSupportedCompressionMethod()",
      "begin_line": 148,
      "end_line": 161,
      "comment": "\n     * Test case for\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     * \u003eCOMPRESS-93\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 62)",
        "(line 157,col 9)-(line 157,col 62)",
        "(line 158,col 9)-(line 158,col 84)",
        "(line 159,col 9)-(line 159,col 50)",
        "(line 160,col 9)-(line 160,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipEntryWithUnsupportedCompressionMethod()",
      "begin_line": 171,
      "end_line": 186,
      "comment": "\n     * Test case for being able to skip an entry in an \n     * {@link ZipArchiveInputStream} even if the compression method of that\n     * entry is unsupported.\n     *\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     *        \u003eCOMPRESS-93\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testListAllFilesWithNestedArchive()",
      "begin_line": 197,
      "end_line": 230,
      "comment": "\n     * Checks if all entries from a nested archive can be read.\n     * The archive: OSX_ArchiveWithNestedArchive.zip contains:\n     * NestedArchiv.zip and test.xml3.\n     * \n     * The nested archive:  NestedArchive.zip contains test1.xml and test2.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 71)",
        "(line 201,col 9)-(line 201,col 55)",
        "(line 203,col 9)-(line 203,col 58)",
        "(line 204,col 9)-(line 204,col 37)",
        "(line 205,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 19)",
        "(line 226,col 9)-(line 226,col 45)",
        "(line 227,col 9)-(line 227,col 38)",
        "(line 228,col 9)-(line 228,col 38)",
        "(line 229,col 9)-(line 229,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testDirectoryEntryFromFile()",
      "begin_line": 232,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 50)",
        "(line 235,col 9)-(line 235,col 28)",
        "(line 236,col 9)-(line 236,col 42)",
        "(line 237,col 9)-(line 237,col 26)",
        "(line 238,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitDirectoryEntry()",
      "begin_line": 268,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 50)",
        "(line 271,col 9)-(line 271,col 28)",
        "(line 272,col 9)-(line 272,col 42)",
        "(line 273,col 9)-(line 273,col 26)",
        "(line 274,col 9)-(line 301,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "first_payload"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "second_payload"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allFilesPredicate"
      ],
      "begin_line": 305,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.Anonymous-d37db907-d3c9-439e-a367-24d278b52a81.test(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 306,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 13)-(line 308,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testCopyRawEntriesFromFile()",
      "begin_line": 312,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 50)",
        "(line 317,col 9)-(line 317,col 89)",
        "(line 319,col 9)-(line 319,col 69)",
        "(line 320,col 9)-(line 320,col 74)",
        "(line 321,col 9)-(line 321,col 41)",
        "(line 322,col 9)-(line 322,col 38)",
        "(line 324,col 9)-(line 324,col 69)",
        "(line 325,col 9)-(line 325,col 75)",
        "(line 326,col 9)-(line 326,col 42)",
        "(line 327,col 9)-(line 327,col 40)",
        "(line 329,col 9)-(line 329,col 44)",
        "(line 330,col 9)-(line 330,col 44)",
        "(line 331,col 9)-(line 331,col 84)",
        "(line 332,col 9)-(line 332,col 83)",
        "(line 333,col 9)-(line 333,col 52)",
        "(line 334,col 9)-(line 334,col 52)",
        "(line 335,col 9)-(line 335,col 21)",
        "(line 339,col 9)-(line 339,col 54)",
        "(line 340,col 9)-(line 340,col 20)",
        "(line 341,col 9)-(line 341,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testCopyRawZip64EntryFromFile()",
      "begin_line": 344,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 50)",
        "(line 349,col 9)-(line 349,col 84)",
        "(line 350,col 9)-(line 350,col 82)",
        "(line 351,col 9)-(line 351,col 43)",
        "(line 352,col 9)-(line 352,col 31)",
        "(line 353,col 9)-(line 353,col 21)",
        "(line 355,col 9)-(line 355,col 73)",
        "(line 356,col 9)-(line 356,col 74)",
        "(line 357,col 9)-(line 357,col 42)",
        "(line 358,col 9)-(line 358,col 38)",
        "(line 360,col 9)-(line 360,col 44)",
        "(line 361,col 9)-(line 361,col 84)",
        "(line 362,col 9)-(line 362,col 83)",
        "(line 363,col 9)-(line 363,col 43)",
        "(line 364,col 9)-(line 364,col 52)",
        "(line 365,col 9)-(line 365,col 21)",
        "(line 366,col 9)-(line 366,col 54)",
        "(line 367,col 9)-(line 367,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testUnixModeInAddRaw()",
      "begin_line": 370,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 50)",
        "(line 375,col 9)-(line 375,col 77)",
        "(line 376,col 9)-(line 376,col 74)",
        "(line 378,col 9)-(line 378,col 73)",
        "(line 379,col 9)-(line 379,col 39)",
        "(line 380,col 9)-(line 380,col 50)",
        "(line 381,col 9)-(line 381,col 89)",
        "(line 382,col 9)-(line 382,col 20)",
        "(line 384,col 9)-(line 384,col 44)",
        "(line 385,col 9)-(line 385,col 58)",
        "(line 386,col 9)-(line 386,col 47)",
        "(line 387,col 9)-(line 387,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createReferenceFile(java.io.File, org.apache.commons.compress.archivers.zip.Zip64Mode, java.lang.String)",
      "begin_line": 390,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 78)",
        "(line 392,col 9)-(line 392,col 81)",
        "(line 393,col 9)-(line 393,col 33)",
        "(line 394,col 9)-(line 394,col 30)",
        "(line 395,col 9)-(line 395,col 31)",
        "(line 396,col 9)-(line 396,col 20)",
        "(line 397,col 9)-(line 397,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createFirstEntry(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)",
      "begin_line": 400,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 60)",
        "(line 402,col 9)-(line 402,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createSecondEntry(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)",
      "begin_line": 405,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 61)",
        "(line 407,col 9)-(line 407,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.assertSameFileContents(java.io.File, java.io.File)",
      "begin_line": 411,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 84)",
        "(line 413,col 9)-(line 413,col 59)",
        "(line 414,col 9)-(line 414,col 55)",
        "(line 415,col 9)-(line 415,col 50)",
        "(line 416,col 9)-(line 416,col 48)",
        "(line 418,col 9)-(line 418,col 94)",
        "(line 419,col 9)-(line 419,col 98)",
        "(line 421,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 444,col 25)",
        "(line 445,col 9)-(line 445,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createArchiveEntry(java.lang.String, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream, java.lang.String)",
      "begin_line": 449,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 61)",
        "(line 452,col 9)-(line 452,col 32)",
        "(line 454,col 9)-(line 454,col 38)",
        "(line 455,col 9)-(line 455,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testFileEntryFromFile()",
      "begin_line": 458,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 50)",
        "(line 461,col 9)-(line 461,col 28)",
        "(line 462,col 9)-(line 462,col 42)",
        "(line 463,col 9)-(line 463,col 26)",
        "(line 464,col 9)-(line 464,col 35)",
        "(line 465,col 9)-(line 500,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitFileEntry()",
      "begin_line": 503,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 50)",
        "(line 506,col 9)-(line 506,col 28)",
        "(line 507,col 9)-(line 507,col 42)",
        "(line 508,col 9)-(line 508,col 26)",
        "(line 509,col 9)-(line 509,col 35)",
        "(line 510,col 9)-(line 547,col 9)"
      ]
    }
  ]
}