{
  "filepath": "/tmp/Compress-5b/src/test/java/org/apache/commons/compress/archivers/ZipTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 35,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipArchiveCreation()",
      "begin_line": 41,
      "end_line": 99,
      "comment": "\n     * Archives 2 files and unarchives it again. If the file length of result\n     * and source is the same, it looks like the operations have worked\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 53)",
        "(line 44,col 9)-(line 44,col 48)",
        "(line 45,col 9)-(line 45,col 48)",
        "(line 47,col 9)-(line 47,col 62)",
        "(line 48,col 9)-(line 48,col 38)",
        "(line 49,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 20)",
        "(line 67,col 9)-(line 67,col 39)",
        "(line 69,col 9)-(line 69,col 59)",
        "(line 70,col 9)-(line 70,col 37)",
        "(line 71,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 19)",
        "(line 94,col 9)-(line 94,col 40)",
        "(line 95,col 9)-(line 95,col 43)",
        "(line 96,col 9)-(line 96,col 54)",
        "(line 97,col 9)-(line 97,col 38)",
        "(line 98,col 9)-(line 98,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipUnarchive()",
      "begin_line": 105,
      "end_line": 114,
      "comment": "\n     * Simple unarchive test. Asserts nothing.\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 46)",
        "(line 107,col 9)-(line 107,col 58)",
        "(line 108,col 9)-(line 108,col 101)",
        "(line 109,col 9)-(line 109,col 73)",
        "(line 110,col 9)-(line 110,col 86)",
        "(line 111,col 9)-(line 111,col 30)",
        "(line 112,col 9)-(line 112,col 20)",
        "(line 113,col 9)-(line 113,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testListAllFilesWithNestedArchive()",
      "begin_line": 125,
      "end_line": 157,
      "comment": "\n     * Checks if all entries from a nested archive can be read.\n     * The archive: OSX_ArchiveWithNestedArchive.zip contains:\n     * NestedArchiv.zip and test.xml3.\n     * \n     * The nested archive:  NestedArchive.zip contains test1.xml and test2.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 71)",
        "(line 128,col 9)-(line 128,col 39)",
        "(line 130,col 9)-(line 130,col 58)",
        "(line 131,col 9)-(line 131,col 37)",
        "(line 132,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 19)",
        "(line 153,col 9)-(line 153,col 45)",
        "(line 154,col 9)-(line 154,col 38)",
        "(line 155,col 9)-(line 155,col 38)",
        "(line 156,col 9)-(line 156,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testDirectoryEntryFromFile()",
      "begin_line": 159,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 44)",
        "(line 161,col 9)-(line 161,col 28)",
        "(line 162,col 9)-(line 162,col 42)",
        "(line 163,col 9)-(line 163,col 26)",
        "(line 164,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitDirectoryEntry()",
      "begin_line": 196,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 44)",
        "(line 198,col 9)-(line 198,col 28)",
        "(line 199,col 9)-(line 199,col 42)",
        "(line 200,col 9)-(line 200,col 26)",
        "(line 201,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testFileEntryFromFile()",
      "begin_line": 233,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 44)",
        "(line 235,col 9)-(line 235,col 28)",
        "(line 236,col 9)-(line 236,col 42)",
        "(line 237,col 9)-(line 237,col 26)",
        "(line 238,col 9)-(line 238,col 35)",
        "(line 239,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitFileEntry()",
      "begin_line": 280,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 44)",
        "(line 282,col 9)-(line 282,col 28)",
        "(line 283,col 9)-(line 283,col 42)",
        "(line 284,col 9)-(line 284,col 26)",
        "(line 285,col 9)-(line 285,col 35)",
        "(line 286,col 9)-(line 326,col 9)"
      ]
    }
  ]
}