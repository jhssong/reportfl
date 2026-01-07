{
  "filepath": "/tmp/Compress-2b/src/test/java/org/apache/commons/compress/AbstractTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resultDir"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " used to delete the archive in tearDown"
    },
    {
      "type": "field",
      "varNames": [
        "archiveList"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Lists the content of the archive as originally created"
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.setUp()",
      "begin_line": 52,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 27)",
        "(line 54,col 9)-(line 54,col 40)",
        "(line 55,col 9)-(line 55,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.mkdir(java.lang.String)",
      "begin_line": 58,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 47)",
        "(line 60,col 9)-(line 60,col 19)",
        "(line 61,col 9)-(line 61,col 18)",
        "(line 62,col 9)-(line 62,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getFile(java.lang.String)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tearDown()",
      "begin_line": 69,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 19)",
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 72,col 31)",
        "(line 73,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.rmdir(java.io.File)",
      "begin_line": 81,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 30)",
        "(line 83,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createArchive(java.lang.String)",
      "begin_line": 124,
      "end_line": 159,
      "comment": "\n     * Creates an archive of textbased files in several directories. The\n     * archivername is the factory identifier for the archiver, for example zip,\n     * tar, cpio, jar, ar. The archive is created as a temp file.\n     * \n     * The archive contains the following files:\n     * \u003cul\u003e\n     * \u003cli\u003etestdata/test1.xml\u003c/li\u003e\n     * \u003cli\u003etestdata/test2.xml\u003c/li\u003e\n     * \u003cli\u003etest/test3.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test4.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test5.xml\u003c/li\u003e\n     * \u003cli\u003ebla/blubber/test6.xml\u003c/li\u003e\n     * \u003cli\u003etest.txt\u003c/li\u003e\n     * \u003cli\u003esomething/bla\u003c/li\u003e\n     * \u003cli\u003etest with spaces.txt\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param archivename\n     *            the identifier of this archive\n     * @return the newly created file\n     * @throws Exception\n     *             in case something goes wrong\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 39)",
        "(line 126,col 9)-(line 126,col 35)",
        "(line 127,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.addArchiveEntry(org.apache.commons.compress.archivers.ArchiveOutputStream, java.lang.String, java.io.File)",
      "begin_line": 169,
      "end_line": 177,
      "comment": "\n     * Add an entry to the archive, and keep track of the names in archiveList.\n     * \n     * @param out\n     * @param file1\n     * @throws IOException\n     * @throws FileNotFoundException\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 62)",
        "(line 172,col 9)-(line 172,col 39)",
        "(line 173,col 9)-(line 173,col 35)",
        "(line 174,col 9)-(line 174,col 55)",
        "(line 175,col 9)-(line 175,col 32)",
        "(line 176,col 9)-(line 176,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createEmptyArchive(java.lang.String)",
      "begin_line": 185,
      "end_line": 201,
      "comment": "\n     * Create an empty archive.\n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 39)",
        "(line 187,col 9)-(line 187,col 35)",
        "(line 188,col 9)-(line 188,col 38)",
        "(line 189,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createSingleEntryArchive(java.lang.String)",
      "begin_line": 210,
      "end_line": 227,
      "comment": "\n     * Create an archive with a single file \"testdata/test1.xml\".\n     * \n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 39)",
        "(line 212,col 9)-(line 212,col 35)",
        "(line 213,col 9)-(line 213,col 38)",
        "(line 214,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(java.io.File, java.util.List)",
      "begin_line": 238,
      "end_line": 248,
      "comment": "\n     * Checks if an archive contains all expected files.\n     * \n     * @param archive\n     *            the archive to check\n     * @param expected\n     *            a list with expected string filenames\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 60)",
        "(line 241,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List)",
      "begin_line": 250,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 60)",
        "(line 253,col 9)-(line 253,col 24)",
        "(line 254,col 9)-(line 254,col 23)",
        "(line 256,col 9)-(line 291,col 9)"
      ]
    }
  ]
}