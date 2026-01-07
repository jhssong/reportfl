{
  "filepath": "/tmp/Compress-7b/src/test/java/org/apache/commons/compress/archivers/ZipTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 37,
      "end_line": 369,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipArchiveCreation()",
      "begin_line": 43,
      "end_line": 101,
      "comment": "\n     * Archives 2 files and unarchives it again. If the file length of result\n     * and source is the same, it looks like the operations have worked\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 53)",
        "(line 46,col 9)-(line 46,col 48)",
        "(line 47,col 9)-(line 47,col 48)",
        "(line 49,col 9)-(line 49,col 62)",
        "(line 50,col 9)-(line 50,col 38)",
        "(line 51,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 20)",
        "(line 69,col 9)-(line 69,col 39)",
        "(line 71,col 9)-(line 71,col 59)",
        "(line 72,col 9)-(line 72,col 37)",
        "(line 73,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 19)",
        "(line 96,col 9)-(line 96,col 40)",
        "(line 97,col 9)-(line 97,col 43)",
        "(line 98,col 9)-(line 98,col 54)",
        "(line 99,col 9)-(line 99,col 38)",
        "(line 100,col 9)-(line 100,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipUnarchive()",
      "begin_line": 107,
      "end_line": 116,
      "comment": "\n     * Simple unarchive test. Asserts nothing.\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 46)",
        "(line 109,col 9)-(line 109,col 58)",
        "(line 110,col 9)-(line 110,col 101)",
        "(line 111,col 9)-(line 111,col 73)",
        "(line 112,col 9)-(line 112,col 86)",
        "(line 113,col 9)-(line 113,col 30)",
        "(line 114,col 9)-(line 114,col 20)",
        "(line 115,col 9)-(line 115,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSupportedCompressionMethod()",
      "begin_line": 123,
      "end_line": 131,
      "comment": "\n     * Test case for\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     * \u003eCOMPRESS-93\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 54)",
        "(line 125,col 9)-(line 125,col 68)",
        "(line 126,col 9)-(line 126,col 20)",
        "(line 128,col 9)-(line 128,col 56)",
        "(line 129,col 9)-(line 129,col 68)",
        "(line 130,col 9)-(line 130,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipEntryWithUnsupportedCompressionMethod()",
      "begin_line": 141,
      "end_line": 157,
      "comment": "\n     * Test case for being able to skip an entry in an \n     * {@link ZipArchiveInputStream} even if the compression method of that\n     * entry is unsupported.\n     *\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     *        \u003eCOMPRESS-93\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 144,col 80)",
        "(line 145,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testListAllFilesWithNestedArchive()",
      "begin_line": 168,
      "end_line": 200,
      "comment": "\n     * Checks if all entries from a nested archive can be read.\n     * The archive: OSX_ArchiveWithNestedArchive.zip contains:\n     * NestedArchiv.zip and test.xml3.\n     * \n     * The nested archive:  NestedArchive.zip contains test1.xml and test2.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 71)",
        "(line 171,col 9)-(line 171,col 39)",
        "(line 173,col 9)-(line 173,col 58)",
        "(line 174,col 9)-(line 174,col 37)",
        "(line 175,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 19)",
        "(line 196,col 9)-(line 196,col 45)",
        "(line 197,col 9)-(line 197,col 38)",
        "(line 198,col 9)-(line 198,col 38)",
        "(line 199,col 9)-(line 199,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testDirectoryEntryFromFile()",
      "begin_line": 202,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 44)",
        "(line 204,col 9)-(line 204,col 28)",
        "(line 205,col 9)-(line 205,col 42)",
        "(line 206,col 9)-(line 206,col 26)",
        "(line 207,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitDirectoryEntry()",
      "begin_line": 239,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 44)",
        "(line 241,col 9)-(line 241,col 28)",
        "(line 242,col 9)-(line 242,col 42)",
        "(line 243,col 9)-(line 243,col 26)",
        "(line 244,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testFileEntryFromFile()",
      "begin_line": 276,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 44)",
        "(line 278,col 9)-(line 278,col 28)",
        "(line 279,col 9)-(line 279,col 42)",
        "(line 280,col 9)-(line 280,col 26)",
        "(line 281,col 9)-(line 281,col 35)",
        "(line 282,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitFileEntry()",
      "begin_line": 322,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 44)",
        "(line 324,col 9)-(line 324,col 28)",
        "(line 325,col 9)-(line 325,col 42)",
        "(line 326,col 9)-(line 326,col 26)",
        "(line 327,col 9)-(line 327,col 35)",
        "(line 328,col 9)-(line 367,col 9)"
      ]
    }
  ]
}