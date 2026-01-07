{
  "filepath": "/tmp/Compress-35b/src/test/java/org/apache/commons/compress/AbstractTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractTestCase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resultDir"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " used to delete the archive in tearDown"
    },
    {
      "type": "field",
      "varNames": [
        "archiveList"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Lists the content of the archive as originally created"
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.setUp()",
      "begin_line": 56,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 27)",
        "(line 59,col 9)-(line 59,col 40)",
        "(line 60,col 9)-(line 60,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.mkdir(java.lang.String)",
      "begin_line": 63,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 47)",
        "(line 65,col 9)-(line 65,col 19)",
        "(line 66,col 9)-(line 66,col 18)",
        "(line 67,col 9)-(line 67,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getFile(java.lang.String)",
      "begin_line": 70,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 76)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 23)",
        "(line 76,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tearDown()",
      "begin_line": 87,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)",
        "(line 90,col 9)-(line 90,col 25)",
        "(line 91,col 9)-(line 91,col 31)",
        "(line 92,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.rmdir(java.io.File)",
      "begin_line": 98,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 30)",
        "(line 100,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 27)",
        "(line 113,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ON_WINDOWS"
      ],
      "begin_line": 118,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tryHardToDelete(java.io.File)",
      "begin_line": 129,
      "end_line": 142,
      "comment": "\n     * Accommodate Windows bug encountered in both Sun and IBM JDKs.\n     * Others possible. If the delete does not work, call System.gc(),\n     * wait a little and try again.\n     *\n     * @return whether deletion was successful\n     * @since Stolen from FileUtils in Ant 1.8.0\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createArchive(java.lang.String)",
      "begin_line": 168,
      "end_line": 205,
      "comment": "\n     * Creates an archive of textbased files in several directories. The\n     * archivername is the factory identifier for the archiver, for example zip,\n     * tar, cpio, jar, ar. The archive is created as a temp file.\n     *\n     * The archive contains the following files:\n     * \u003cul\u003e\n     * \u003cli\u003etestdata/test1.xml\u003c/li\u003e\n     * \u003cli\u003etestdata/test2.xml\u003c/li\u003e\n     * \u003cli\u003etest/test3.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test4.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test5.xml\u003c/li\u003e\n     * \u003cli\u003ebla/blubber/test6.xml\u003c/li\u003e\n     * \u003cli\u003etest.txt\u003c/li\u003e\n     * \u003cli\u003esomething/bla\u003c/li\u003e\n     * \u003cli\u003etest with spaces.txt\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param archivename\n     *            the identifier of this archive\n     * @return the newly created file\n     * @throws Exception\n     *             in case something goes wrong\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 39)",
        "(line 170,col 9)-(line 170,col 35)",
        "(line 171,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.addArchiveEntry(org.apache.commons.compress.archivers.ArchiveOutputStream, java.lang.String, java.io.File)",
      "begin_line": 215,
      "end_line": 222,
      "comment": "\n     * Add an entry to the archive, and keep track of the names in archiveList.\n     *\n     * @param out\n     * @param file1\n     * @throws IOException\n     * @throws FileNotFoundException\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 70)",
        "(line 218,col 9)-(line 218,col 35)",
        "(line 219,col 9)-(line 219,col 55)",
        "(line 220,col 9)-(line 220,col 32)",
        "(line 221,col 9)-(line 221,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createEmptyArchive(java.lang.String)",
      "begin_line": 230,
      "end_line": 248,
      "comment": "\n     * Create an empty archive.\n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 39)",
        "(line 232,col 9)-(line 232,col 35)",
        "(line 233,col 9)-(line 233,col 46)",
        "(line 234,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createSingleEntryArchive(java.lang.String)",
      "begin_line": 257,
      "end_line": 277,
      "comment": "\n     * Create an archive with a single file \"test1.xml\".\n     *\n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 39)",
        "(line 259,col 9)-(line 259,col 35)",
        "(line 260,col 9)-(line 260,col 46)",
        "(line 261,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(java.io.File, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 288,
      "end_line": 298,
      "comment": "\n     * Checks if an archive contains all expected files.\n     *\n     * @param archive\n     *            the archive to check\n     * @param expected\n     *            a list with expected string filenames\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 60)",
        "(line 291,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 307,
      "end_line": 310,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     *\n     * @param in\n     * @param expected list of expected entries or {@code null} if no check of names desired\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 321,
      "end_line": 368,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     *\n     * @param in\n     * @param expected list of expected entries or {@code null} if no check of names desired\n     * @param cleanUp Cleans up resources if true\n     * @return returns the created result file if cleanUp \u003d false, or null otherwise\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 42)",
        "(line 324,col 9)-(line 324,col 30)",
        "(line 326,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getExpectedString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Override this method to change what is to be compared in the List.\n     * For example, size + name instead of just name.\n     *\n     * @param entry\n     * @return returns the entry name\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createTempDirAndFile()",
      "begin_line": 386,
      "end_line": 397,
      "comment": "\n     * Creates a temporary directory and a temporary file inside that\n     * directory, returns both of them (the directory is the first\n     * element of the two element array).\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 38)",
        "(line 388,col 9)-(line 388,col 67)",
        "(line 389,col 9)-(line 389,col 31)",
        "(line 390,col 9)-(line 390,col 61)",
        "(line 391,col 9)-(line 396,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createTempDir()",
      "begin_line": 399,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 39)",
        "(line 401,col 9)-(line 401,col 30)",
        "(line 402,col 9)-(line 402,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.closeQuietly(java.io.Closeable)",
      "begin_line": 405,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 412,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StreamWrapper",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 415,
      "end_line": 417,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.StreamWrapper.wrap(java.io.InputStream)",
      "begin_line": 416,
      "end_line": 416,
      "comment": "",
      "child_ranges": []
    }
  ]
}