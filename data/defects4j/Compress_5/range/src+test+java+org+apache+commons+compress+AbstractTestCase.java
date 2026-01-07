{
  "filepath": "/tmp/Compress-5b/src/test/java/org/apache/commons/compress/AbstractTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 41,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resultDir"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " used to delete the archive in tearDown"
    },
    {
      "type": "field",
      "varNames": [
        "archiveList"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Lists the content of the archive as originally created"
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.AbstractTestCase.AbstractTestCase()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.AbstractTestCase.AbstractTestCase(java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.setUp()",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 27)",
        "(line 61,col 9)-(line 61,col 40)",
        "(line 62,col 9)-(line 62,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.mkdir(java.lang.String)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 47)",
        "(line 67,col 9)-(line 67,col 19)",
        "(line 68,col 9)-(line 68,col 18)",
        "(line 69,col 9)-(line 69,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getFile(java.lang.String)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tearDown()",
      "begin_line": 76,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 19)",
        "(line 78,col 9)-(line 78,col 25)",
        "(line 79,col 9)-(line 79,col 31)",
        "(line 80,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.rmdir(java.io.File)",
      "begin_line": 88,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 30)",
        "(line 90,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createArchive(java.lang.String)",
      "begin_line": 131,
      "end_line": 167,
      "comment": "\n     * Creates an archive of textbased files in several directories. The\n     * archivername is the factory identifier for the archiver, for example zip,\n     * tar, cpio, jar, ar. The archive is created as a temp file.\n     * \n     * The archive contains the following files:\n     * \u003cul\u003e\n     * \u003cli\u003etestdata/test1.xml\u003c/li\u003e\n     * \u003cli\u003etestdata/test2.xml\u003c/li\u003e\n     * \u003cli\u003etest/test3.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test4.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test5.xml\u003c/li\u003e\n     * \u003cli\u003ebla/blubber/test6.xml\u003c/li\u003e\n     * \u003cli\u003etest.txt\u003c/li\u003e\n     * \u003cli\u003esomething/bla\u003c/li\u003e\n     * \u003cli\u003etest with spaces.txt\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param archivename\n     *            the identifier of this archive\n     * @return the newly created file\n     * @throws Exception\n     *             in case something goes wrong\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 39)",
        "(line 133,col 9)-(line 133,col 35)",
        "(line 134,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.addArchiveEntry(org.apache.commons.compress.archivers.ArchiveOutputStream, java.lang.String, java.io.File)",
      "begin_line": 177,
      "end_line": 184,
      "comment": "\n     * Add an entry to the archive, and keep track of the names in archiveList.\n     * \n     * @param out\n     * @param file1\n     * @throws IOException\n     * @throws FileNotFoundException\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 70)",
        "(line 180,col 9)-(line 180,col 35)",
        "(line 181,col 9)-(line 181,col 55)",
        "(line 182,col 9)-(line 182,col 32)",
        "(line 183,col 9)-(line 183,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createEmptyArchive(java.lang.String)",
      "begin_line": 192,
      "end_line": 209,
      "comment": "\n     * Create an empty archive.\n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 39)",
        "(line 194,col 9)-(line 194,col 35)",
        "(line 195,col 9)-(line 195,col 38)",
        "(line 196,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createSingleEntryArchive(java.lang.String)",
      "begin_line": 218,
      "end_line": 237,
      "comment": "\n     * Create an archive with a single file \"test1.xml\".\n     * \n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 39)",
        "(line 220,col 9)-(line 220,col 35)",
        "(line 221,col 9)-(line 221,col 38)",
        "(line 222,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(java.io.File, java.util.List)",
      "begin_line": 248,
      "end_line": 258,
      "comment": "\n     * Checks if an archive contains all expected files.\n     * \n     * @param archive\n     *            the archive to check\n     * @param expected\n     *            a list with expected string filenames\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 60)",
        "(line 251,col 9)-(line 257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List)",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     * \n     * @param in\n     * @param expected list of expected entries or \u003ccode\u003enull\u003c/code\u003e if no check of names desired\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List, boolean)",
      "begin_line": 281,
      "end_line": 329,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     * \n     * @param in\n     * @param expected list of expected entries or \u003ccode\u003enull\u003c/code\u003e if no check of names desired\n     * @param cleanUp Cleans up resources if true \n     * @return returns the created result file if cleanUp \u003d false, or null otherwise \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 60)",
        "(line 284,col 9)-(line 284,col 24)",
        "(line 285,col 9)-(line 285,col 23)",
        "(line 287,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getExpectedString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n     * Override this method to change what is to be compared in the List.\n     * For example, size + name instead of just name.\n     * \n     * @param entry\n     * @return returns the entry name\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createTempDirAndFile()",
      "begin_line": 347,
      "end_line": 361,
      "comment": "\n     * Creates a temporary directory and a temporary file inside that\n     * directory, returns both of them (the directory is the first\n     * element of the two element array).\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 57)",
        "(line 349,col 9)-(line 349,col 24)",
        "(line 350,col 9)-(line 350,col 23)",
        "(line 351,col 9)-(line 351,col 30)",
        "(line 352,col 9)-(line 352,col 67)",
        "(line 353,col 9)-(line 353,col 31)",
        "(line 354,col 9)-(line 354,col 61)",
        "(line 355,col 9)-(line 360,col 9)"
      ]
    }
  ]
}