{
  "filepath": "/tmp/Compress-3b/src/test/java/org/apache/commons/compress/archivers/ZipTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 33,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipArchiveCreation()",
      "begin_line": 39,
      "end_line": 97,
      "comment": "\n     * Archives 2 files and unarchives it again. If the file length of result\n     * and source is the same, it looks like the operations have worked\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 53)",
        "(line 42,col 9)-(line 42,col 48)",
        "(line 43,col 9)-(line 43,col 48)",
        "(line 45,col 9)-(line 45,col 62)",
        "(line 46,col 9)-(line 46,col 38)",
        "(line 47,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 20)",
        "(line 65,col 9)-(line 65,col 39)",
        "(line 67,col 9)-(line 67,col 59)",
        "(line 68,col 9)-(line 68,col 37)",
        "(line 69,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 19)",
        "(line 92,col 9)-(line 92,col 40)",
        "(line 93,col 9)-(line 93,col 43)",
        "(line 94,col 9)-(line 94,col 54)",
        "(line 95,col 9)-(line 95,col 38)",
        "(line 96,col 9)-(line 96,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipUnarchive()",
      "begin_line": 103,
      "end_line": 112,
      "comment": "\n     * Simple unarchive test. Asserts nothing.\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 46)",
        "(line 105,col 9)-(line 105,col 58)",
        "(line 106,col 9)-(line 106,col 101)",
        "(line 107,col 9)-(line 107,col 73)",
        "(line 108,col 9)-(line 108,col 86)",
        "(line 109,col 9)-(line 109,col 30)",
        "(line 110,col 9)-(line 110,col 20)",
        "(line 111,col 9)-(line 111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testListAllFilesWithNestedArchive()",
      "begin_line": 123,
      "end_line": 155,
      "comment": "\n     * Checks if all entries from a nested archive can be read.\n     * The archive: OSX_ArchiveWithNestedArchive.zip contains:\n     * NestedArchiv.zip and test.xml3.\n     * \n     * The nested archive:  NestedArchive.zip contains test1.xml and test2.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 71)",
        "(line 126,col 9)-(line 126,col 39)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 129,col 37)",
        "(line 130,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 19)",
        "(line 151,col 9)-(line 151,col 45)",
        "(line 152,col 9)-(line 152,col 38)",
        "(line 153,col 9)-(line 153,col 38)",
        "(line 154,col 9)-(line 154,col 38)"
      ]
    }
  ]
}