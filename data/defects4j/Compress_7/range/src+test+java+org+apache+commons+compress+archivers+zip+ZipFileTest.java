{
  "filepath": "/tmp/Compress-7b/src/test/java/org/apache/commons/compress/archivers/zip/ZipFileTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFileTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zf"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.tearDown()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testCDOrder()",
      "begin_line": 35,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 24)",
        "(line 37,col 9)-(line 37,col 56)",
        "(line 38,col 9)-(line 38,col 59)",
        "(line 39,col 9)-(line 39,col 47)",
        "(line 40,col 9)-(line 40,col 49)",
        "(line 41,col 9)-(line 41,col 53)",
        "(line 42,col 9)-(line 42,col 51)",
        "(line 43,col 9)-(line 43,col 43)",
        "(line 44,col 9)-(line 44,col 48)",
        "(line 45,col 9)-(line 45,col 55)",
        "(line 46,col 9)-(line 46,col 58)",
        "(line 47,col 9)-(line 47,col 55)",
        "(line 48,col 9)-(line 48,col 43)",
        "(line 49,col 9)-(line 49,col 60)",
        "(line 50,col 9)-(line 50,col 57)",
        "(line 51,col 9)-(line 51,col 50)",
        "(line 52,col 9)-(line 52,col 56)",
        "(line 53,col 9)-(line 53,col 57)",
        "(line 54,col 9)-(line 54,col 46)",
        "(line 55,col 9)-(line 55,col 52)",
        "(line 56,col 9)-(line 56,col 48)",
        "(line 57,col 9)-(line 57,col 42)",
        "(line 58,col 9)-(line 58,col 42)",
        "(line 59,col 9)-(line 59,col 43)",
        "(line 60,col 9)-(line 60,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testPhysicalOrder()",
      "begin_line": 63,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 24)",
        "(line 65,col 9)-(line 65,col 71)",
        "(line 66,col 9)-(line 66,col 59)",
        "(line 67,col 9)-(line 67,col 47)",
        "(line 68,col 9)-(line 68,col 49)",
        "(line 69,col 9)-(line 69,col 53)",
        "(line 70,col 9)-(line 70,col 51)",
        "(line 71,col 9)-(line 71,col 43)",
        "(line 72,col 9)-(line 72,col 48)",
        "(line 73,col 9)-(line 73,col 55)",
        "(line 74,col 9)-(line 74,col 58)",
        "(line 75,col 9)-(line 75,col 55)",
        "(line 76,col 9)-(line 76,col 43)",
        "(line 77,col 9)-(line 77,col 60)",
        "(line 78,col 9)-(line 78,col 57)",
        "(line 79,col 9)-(line 79,col 50)",
        "(line 80,col 9)-(line 80,col 56)",
        "(line 81,col 9)-(line 81,col 57)",
        "(line 82,col 9)-(line 82,col 46)",
        "(line 83,col 9)-(line 83,col 52)",
        "(line 84,col 9)-(line 84,col 48)",
        "(line 85,col 9)-(line 85,col 42)",
        "(line 86,col 9)-(line 86,col 42)",
        "(line 87,col 9)-(line 87,col 43)",
        "(line 88,col 9)-(line 88,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.readOrderTest()",
      "begin_line": 101,
      "end_line": 105,
      "comment": "\n     * ordertest.zip has been handcrafted.\n     *\n     * It contains enough files so any random coincidence of\n     * entries.keySet() and central directory order would be unlikely\n     * - in fact testCDOrder fails in svn revision 920284.\n     *\n     * The central directory has ZipFile and ZipUtil swapped so\n     * central directory order is different from entry data order.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 59)",
        "(line 103,col 9)-(line 103,col 57)",
        "(line 104,col 9)-(line 104,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.assertEntryName(java.util.ArrayList, int, java.lang.String)",
      "begin_line": 107,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 66)",
        "(line 110,col 9)-(line 112,col 35)"
      ]
    }
  ]
}