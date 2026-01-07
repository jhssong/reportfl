{
  "filepath": "/tmp/Compress-46b/src/test/java/org/apache/commons/compress/archivers/ZipTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 49,
      "end_line": 601,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipArchiveCreation()",
      "begin_line": 55,
      "end_line": 111,
      "comment": "\n     * Archives 2 files and unarchives it again. If the file length of result\n     * and source is the same, it looks like the operations have worked\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 53)",
        "(line 59,col 9)-(line 59,col 48)",
        "(line 60,col 9)-(line 60,col 48)",
        "(line 62,col 9)-(line 62,col 62)",
        "(line 63,col 9)-(line 63,col 38)",
        "(line 64,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 20)",
        "(line 82,col 9)-(line 82,col 53)",
        "(line 84,col 9)-(line 84,col 59)",
        "(line 85,col 9)-(line 85,col 37)",
        "(line 86,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 19)",
        "(line 106,col 9)-(line 106,col 40)",
        "(line 107,col 9)-(line 107,col 37)",
        "(line 108,col 9)-(line 108,col 54)",
        "(line 109,col 9)-(line 109,col 32)",
        "(line 110,col 9)-(line 110,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipArchiveCreationInMemory()",
      "begin_line": 118,
      "end_line": 154,
      "comment": "\n     * Archives 2 files and unarchives it again. If the file contents of result\n     * and source is the same, it looks like the operations have worked\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 48)",
        "(line 121,col 9)-(line 121,col 48)",
        "(line 122,col 9)-(line 122,col 68)",
        "(line 123,col 9)-(line 123,col 68)",
        "(line 124,col 9)-(line 124,col 69)",
        "(line 125,col 9)-(line 125,col 69)",
        "(line 127,col 9)-(line 127,col 74)",
        "(line 128,col 9)-(line 136,col 9)",
        "(line 139,col 9)-(line 139,col 55)",
        "(line 141,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 152,col 57)",
        "(line 153,col 9)-(line 153,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipUnarchive()",
      "begin_line": 160,
      "end_line": 170,
      "comment": "\n     * Simple unarchive test. Asserts nothing.\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 46)",
        "(line 163,col 9)-(line 163,col 58)",
        "(line 164,col 9)-(line 164,col 101)",
        "(line 165,col 9)-(line 165,col 73)",
        "(line 166,col 9)-(line 166,col 86)",
        "(line 167,col 9)-(line 167,col 30)",
        "(line 168,col 9)-(line 168,col 20)",
        "(line 169,col 9)-(line 169,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipsPK00Prefix()",
      "begin_line": 177,
      "end_line": 186,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 55)",
        "(line 180,col 9)-(line 180,col 55)",
        "(line 181,col 9)-(line 181,col 28)",
        "(line 182,col 9)-(line 182,col 28)",
        "(line 183,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSupportedCompressionMethod()",
      "begin_line": 193,
      "end_line": 206,
      "comment": "\n     * Test case for\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     * \u003eCOMPRESS-93\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 62)",
        "(line 202,col 9)-(line 202,col 62)",
        "(line 203,col 9)-(line 203,col 84)",
        "(line 204,col 9)-(line 204,col 50)",
        "(line 205,col 9)-(line 205,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipEntryWithUnsupportedCompressionMethod()",
      "begin_line": 216,
      "end_line": 231,
      "comment": "\n     * Test case for being able to skip an entry in an \n     * {@link ZipArchiveInputStream} even if the compression method of that\n     * entry is unsupported.\n     *\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     *        \u003eCOMPRESS-93\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testListAllFilesWithNestedArchive()",
      "begin_line": 242,
      "end_line": 282,
      "comment": "\n     * Checks if all entries from a nested archive can be read.\n     * The archive: OSX_ArchiveWithNestedArchive.zip contains:\n     * NestedArchiv.zip and test.xml3.\n     * \n     * The nested archive:  NestedArchive.zip contains test1.xml and test2.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 71)",
        "(line 246,col 9)-(line 246,col 55)",
        "(line 247,col 9)-(line 247,col 72)",
        "(line 249,col 9)-(line 249,col 58)",
        "(line 250,col 9)-(line 250,col 37)",
        "(line 251,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 19)",
        "(line 277,col 9)-(line 277,col 57)",
        "(line 278,col 9)-(line 278,col 50)",
        "(line 279,col 9)-(line 279,col 50)",
        "(line 280,col 9)-(line 280,col 50)",
        "(line 281,col 9)-(line 281,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testDirectoryEntryFromFile()",
      "begin_line": 284,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 50)",
        "(line 287,col 9)-(line 287,col 28)",
        "(line 288,col 9)-(line 288,col 42)",
        "(line 289,col 9)-(line 289,col 26)",
        "(line 290,col 9)-(line 317,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitDirectoryEntry()",
      "begin_line": 320,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 50)",
        "(line 323,col 9)-(line 323,col 28)",
        "(line 324,col 9)-(line 324,col 42)",
        "(line 325,col 9)-(line 325,col 26)",
        "(line 326,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "first_payload"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "second_payload"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allFilesPredicate"
      ],
      "begin_line": 357,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.Anonymous-2581c860-4257-49f1-a270-0ca7a15a20bd.test(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 358,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 13)-(line 360,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testCopyRawEntriesFromFile()",
      "begin_line": 364,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 50)",
        "(line 369,col 9)-(line 369,col 89)",
        "(line 371,col 9)-(line 371,col 69)",
        "(line 372,col 9)-(line 372,col 74)",
        "(line 373,col 9)-(line 373,col 41)",
        "(line 374,col 9)-(line 374,col 38)",
        "(line 376,col 9)-(line 376,col 69)",
        "(line 377,col 9)-(line 377,col 75)",
        "(line 378,col 9)-(line 378,col 42)",
        "(line 379,col 9)-(line 379,col 40)",
        "(line 381,col 9)-(line 381,col 44)",
        "(line 382,col 9)-(line 382,col 44)",
        "(line 383,col 9)-(line 383,col 84)",
        "(line 384,col 9)-(line 384,col 83)",
        "(line 385,col 9)-(line 385,col 52)",
        "(line 386,col 9)-(line 386,col 52)",
        "(line 387,col 9)-(line 387,col 21)",
        "(line 391,col 9)-(line 391,col 54)",
        "(line 392,col 9)-(line 392,col 20)",
        "(line 393,col 9)-(line 393,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testCopyRawZip64EntryFromFile()",
      "begin_line": 396,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 50)",
        "(line 401,col 9)-(line 401,col 84)",
        "(line 402,col 9)-(line 402,col 82)",
        "(line 403,col 9)-(line 403,col 43)",
        "(line 404,col 9)-(line 404,col 31)",
        "(line 405,col 9)-(line 405,col 21)",
        "(line 407,col 9)-(line 407,col 73)",
        "(line 408,col 9)-(line 408,col 74)",
        "(line 409,col 9)-(line 409,col 42)",
        "(line 410,col 9)-(line 410,col 38)",
        "(line 412,col 9)-(line 412,col 44)",
        "(line 413,col 9)-(line 413,col 84)",
        "(line 414,col 9)-(line 414,col 83)",
        "(line 415,col 9)-(line 415,col 43)",
        "(line 416,col 9)-(line 416,col 52)",
        "(line 417,col 9)-(line 417,col 21)",
        "(line 418,col 9)-(line 418,col 54)",
        "(line 419,col 9)-(line 419,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testUnixModeInAddRaw()",
      "begin_line": 422,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 50)",
        "(line 427,col 9)-(line 427,col 77)",
        "(line 428,col 9)-(line 428,col 74)",
        "(line 430,col 9)-(line 430,col 73)",
        "(line 431,col 9)-(line 431,col 39)",
        "(line 432,col 9)-(line 432,col 50)",
        "(line 433,col 9)-(line 433,col 89)",
        "(line 434,col 9)-(line 434,col 20)",
        "(line 436,col 9)-(line 436,col 44)",
        "(line 437,col 9)-(line 437,col 58)",
        "(line 438,col 9)-(line 438,col 47)",
        "(line 439,col 9)-(line 439,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createReferenceFile(java.io.File, org.apache.commons.compress.archivers.zip.Zip64Mode, java.lang.String)",
      "begin_line": 442,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 78)",
        "(line 444,col 9)-(line 444,col 81)",
        "(line 445,col 9)-(line 445,col 33)",
        "(line 446,col 9)-(line 446,col 30)",
        "(line 447,col 9)-(line 447,col 31)",
        "(line 448,col 9)-(line 448,col 20)",
        "(line 449,col 9)-(line 449,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createFirstEntry(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)",
      "begin_line": 452,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 60)",
        "(line 454,col 9)-(line 454,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createSecondEntry(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)",
      "begin_line": 457,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 61)",
        "(line 459,col 9)-(line 459,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.assertSameFileContents(java.io.File, java.io.File)",
      "begin_line": 463,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 84)",
        "(line 465,col 9)-(line 465,col 59)",
        "(line 466,col 9)-(line 466,col 55)",
        "(line 467,col 9)-(line 467,col 50)",
        "(line 468,col 9)-(line 468,col 48)",
        "(line 470,col 9)-(line 470,col 94)",
        "(line 471,col 9)-(line 471,col 98)",
        "(line 473,col 9)-(line 494,col 9)",
        "(line 496,col 9)-(line 496,col 25)",
        "(line 497,col 9)-(line 497,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createArchiveEntry(java.lang.String, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream, java.lang.String)",
      "begin_line": 501,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 61)",
        "(line 504,col 9)-(line 504,col 32)",
        "(line 506,col 9)-(line 506,col 38)",
        "(line 507,col 9)-(line 507,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testFileEntryFromFile()",
      "begin_line": 510,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 50)",
        "(line 513,col 9)-(line 513,col 28)",
        "(line 514,col 9)-(line 514,col 42)",
        "(line 515,col 9)-(line 515,col 26)",
        "(line 516,col 9)-(line 516,col 35)",
        "(line 517,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitFileEntry()",
      "begin_line": 555,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 50)",
        "(line 558,col 9)-(line 558,col 28)",
        "(line 559,col 9)-(line 559,col 42)",
        "(line 560,col 9)-(line 560,col 26)",
        "(line 561,col 9)-(line 561,col 35)",
        "(line 562,col 9)-(line 599,col 9)"
      ]
    }
  ]
}