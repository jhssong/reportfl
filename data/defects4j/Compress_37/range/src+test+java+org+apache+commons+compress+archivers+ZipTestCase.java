{
  "filepath": "/tmp/Compress-37b/src/test/java/org/apache/commons/compress/archivers/ZipTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 47,
      "end_line": 559,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipArchiveCreation()",
      "begin_line": 53,
      "end_line": 112,
      "comment": "\n     * Archives 2 files and unarchives it again. If the file length of result\n     * and source is the same, it looks like the operations have worked\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 53)",
        "(line 57,col 9)-(line 57,col 48)",
        "(line 58,col 9)-(line 58,col 48)",
        "(line 60,col 9)-(line 60,col 62)",
        "(line 61,col 9)-(line 61,col 38)",
        "(line 62,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 20)",
        "(line 80,col 9)-(line 80,col 57)",
        "(line 82,col 9)-(line 82,col 59)",
        "(line 83,col 9)-(line 83,col 37)",
        "(line 84,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 19)",
        "(line 107,col 9)-(line 107,col 40)",
        "(line 108,col 9)-(line 108,col 37)",
        "(line 109,col 9)-(line 109,col 54)",
        "(line 110,col 9)-(line 110,col 32)",
        "(line 111,col 9)-(line 111,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipUnarchive()",
      "begin_line": 118,
      "end_line": 128,
      "comment": "\n     * Simple unarchive test. Asserts nothing.\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 46)",
        "(line 121,col 9)-(line 121,col 58)",
        "(line 122,col 9)-(line 122,col 101)",
        "(line 123,col 9)-(line 123,col 73)",
        "(line 124,col 9)-(line 124,col 86)",
        "(line 125,col 9)-(line 125,col 30)",
        "(line 126,col 9)-(line 126,col 20)",
        "(line 127,col 9)-(line 127,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipsPK00Prefix()",
      "begin_line": 135,
      "end_line": 147,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 55)",
        "(line 138,col 9)-(line 138,col 58)",
        "(line 139,col 9)-(line 139,col 61)",
        "(line 140,col 9)-(line 140,col 28)",
        "(line 141,col 9)-(line 141,col 28)",
        "(line 142,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSupportedCompressionMethod()",
      "begin_line": 154,
      "end_line": 167,
      "comment": "\n     * Test case for\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     * \u003eCOMPRESS-93\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 62)",
        "(line 163,col 9)-(line 163,col 62)",
        "(line 164,col 9)-(line 164,col 84)",
        "(line 165,col 9)-(line 165,col 50)",
        "(line 166,col 9)-(line 166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipEntryWithUnsupportedCompressionMethod()",
      "begin_line": 177,
      "end_line": 196,
      "comment": "\n     * Test case for being able to skip an entry in an \n     * {@link ZipArchiveInputStream} even if the compression method of that\n     * entry is unsupported.\n     *\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     *        \u003eCOMPRESS-93\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 181,col 80)",
        "(line 182,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testListAllFilesWithNestedArchive()",
      "begin_line": 207,
      "end_line": 240,
      "comment": "\n     * Checks if all entries from a nested archive can be read.\n     * The archive: OSX_ArchiveWithNestedArchive.zip contains:\n     * NestedArchiv.zip and test.xml3.\n     * \n     * The nested archive:  NestedArchive.zip contains test1.xml and test2.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 71)",
        "(line 211,col 9)-(line 211,col 61)",
        "(line 213,col 9)-(line 213,col 58)",
        "(line 214,col 9)-(line 214,col 37)",
        "(line 215,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 19)",
        "(line 236,col 9)-(line 236,col 45)",
        "(line 237,col 9)-(line 237,col 38)",
        "(line 238,col 9)-(line 238,col 38)",
        "(line 239,col 9)-(line 239,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testDirectoryEntryFromFile()",
      "begin_line": 242,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 50)",
        "(line 245,col 9)-(line 245,col 28)",
        "(line 246,col 9)-(line 246,col 42)",
        "(line 247,col 9)-(line 247,col 26)",
        "(line 248,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitDirectoryEntry()",
      "begin_line": 278,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 50)",
        "(line 281,col 9)-(line 281,col 28)",
        "(line 282,col 9)-(line 282,col 42)",
        "(line 283,col 9)-(line 283,col 26)",
        "(line 284,col 9)-(line 311,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "first_payload"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "second_payload"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allFilesPredicate"
      ],
      "begin_line": 315,
      "end_line": 320,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.Anonymous-4d15f90f-8cb0-4366-a3be-20448f188d23.test(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 316,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 318,col 13)-(line 318,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testCopyRawEntriesFromFile()",
      "begin_line": 322,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 50)",
        "(line 327,col 9)-(line 327,col 89)",
        "(line 329,col 9)-(line 329,col 69)",
        "(line 330,col 9)-(line 330,col 74)",
        "(line 331,col 9)-(line 331,col 41)",
        "(line 332,col 9)-(line 332,col 38)",
        "(line 334,col 9)-(line 334,col 69)",
        "(line 335,col 9)-(line 335,col 75)",
        "(line 336,col 9)-(line 336,col 42)",
        "(line 337,col 9)-(line 337,col 40)",
        "(line 339,col 9)-(line 339,col 44)",
        "(line 340,col 9)-(line 340,col 44)",
        "(line 341,col 9)-(line 341,col 84)",
        "(line 342,col 9)-(line 342,col 83)",
        "(line 343,col 9)-(line 343,col 52)",
        "(line 344,col 9)-(line 344,col 52)",
        "(line 345,col 9)-(line 345,col 21)",
        "(line 349,col 9)-(line 349,col 54)",
        "(line 350,col 9)-(line 350,col 20)",
        "(line 351,col 9)-(line 351,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testCopyRawZip64EntryFromFile()",
      "begin_line": 354,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 50)",
        "(line 359,col 9)-(line 359,col 84)",
        "(line 360,col 9)-(line 360,col 82)",
        "(line 361,col 9)-(line 361,col 43)",
        "(line 362,col 9)-(line 362,col 31)",
        "(line 363,col 9)-(line 363,col 21)",
        "(line 365,col 9)-(line 365,col 73)",
        "(line 366,col 9)-(line 366,col 74)",
        "(line 367,col 9)-(line 367,col 42)",
        "(line 368,col 9)-(line 368,col 38)",
        "(line 370,col 9)-(line 370,col 44)",
        "(line 371,col 9)-(line 371,col 84)",
        "(line 372,col 9)-(line 372,col 83)",
        "(line 373,col 9)-(line 373,col 43)",
        "(line 374,col 9)-(line 374,col 52)",
        "(line 375,col 9)-(line 375,col 21)",
        "(line 376,col 9)-(line 376,col 54)",
        "(line 377,col 9)-(line 377,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testUnixModeInAddRaw()",
      "begin_line": 380,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 50)",
        "(line 385,col 9)-(line 385,col 77)",
        "(line 386,col 9)-(line 386,col 74)",
        "(line 388,col 9)-(line 388,col 73)",
        "(line 389,col 9)-(line 389,col 39)",
        "(line 390,col 9)-(line 390,col 50)",
        "(line 391,col 9)-(line 391,col 89)",
        "(line 392,col 9)-(line 392,col 20)",
        "(line 394,col 9)-(line 394,col 44)",
        "(line 395,col 9)-(line 395,col 58)",
        "(line 396,col 9)-(line 396,col 47)",
        "(line 397,col 9)-(line 397,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createReferenceFile(java.io.File, org.apache.commons.compress.archivers.zip.Zip64Mode, java.lang.String)",
      "begin_line": 400,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 78)",
        "(line 402,col 9)-(line 402,col 81)",
        "(line 403,col 9)-(line 403,col 33)",
        "(line 404,col 9)-(line 404,col 30)",
        "(line 405,col 9)-(line 405,col 31)",
        "(line 406,col 9)-(line 406,col 20)",
        "(line 407,col 9)-(line 407,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createFirstEntry(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)",
      "begin_line": 410,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 60)",
        "(line 412,col 9)-(line 412,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createSecondEntry(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)",
      "begin_line": 415,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 61)",
        "(line 417,col 9)-(line 417,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.assertSameFileContents(java.io.File, java.io.File)",
      "begin_line": 421,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 84)",
        "(line 423,col 9)-(line 423,col 59)",
        "(line 424,col 9)-(line 424,col 55)",
        "(line 425,col 9)-(line 425,col 50)",
        "(line 426,col 9)-(line 426,col 48)",
        "(line 428,col 9)-(line 428,col 94)",
        "(line 429,col 9)-(line 429,col 98)",
        "(line 431,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 25)",
        "(line 455,col 9)-(line 455,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createArchiveEntry(java.lang.String, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream, java.lang.String)",
      "begin_line": 459,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 61)",
        "(line 462,col 9)-(line 462,col 32)",
        "(line 464,col 9)-(line 464,col 38)",
        "(line 465,col 9)-(line 465,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testFileEntryFromFile()",
      "begin_line": 468,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 50)",
        "(line 471,col 9)-(line 471,col 28)",
        "(line 472,col 9)-(line 472,col 42)",
        "(line 473,col 9)-(line 473,col 26)",
        "(line 474,col 9)-(line 474,col 35)",
        "(line 475,col 9)-(line 510,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitFileEntry()",
      "begin_line": 513,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 50)",
        "(line 516,col 9)-(line 516,col 28)",
        "(line 517,col 9)-(line 517,col 42)",
        "(line 518,col 9)-(line 518,col 26)",
        "(line 519,col 9)-(line 519,col 35)",
        "(line 520,col 9)-(line 557,col 9)"
      ]
    }
  ]
}