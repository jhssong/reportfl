{
  "filepath": "/tmp/Compress-2b/src/test/java/org/apache/commons/compress/changes/ChangeSetTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSetTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 42,
      "end_line": 734,
      "comment": "\n * Checks several ChangeSet business logics.\n "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.archiveListDelete(java.lang.String)",
      "begin_line": 46,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 45)",
        "(line 48,col 9)-(line 53,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir()",
      "begin_line": 64,
      "end_line": 93,
      "comment": "\n     * Tries to delete the folder \"bla\" from a zip file. This should result in\n     * the deletion of bla/*, which actually means bla/test4.xml should be\n     * removed from this zipfile. The file something/bla (without ending, named\n     * like the folder) should not be deleted.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 47)",
        "(line 67,col 9)-(line 67,col 39)",
        "(line 68,col 9)-(line 68,col 38)",
        "(line 69,col 9)-(line 69,col 58)",
        "(line 70,col 9)-(line 70,col 30)",
        "(line 71,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile()",
      "begin_line": 101,
      "end_line": 130,
      "comment": "\n     * Tries to delete the file \"bla/test5.xml\" from a zip file. This should\n     * result in the deletion of \"bla/test5.xml\".\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 47)",
        "(line 104,col 9)-(line 104,col 39)",
        "(line 105,col 9)-(line 105,col 38)",
        "(line 106,col 9)-(line 106,col 58)",
        "(line 107,col 9)-(line 107,col 30)",
        "(line 108,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAdd()",
      "begin_line": 139,
      "end_line": 174,
      "comment": "\n     * Tries to delete a directory with a file and adds a new directory with a\n     * new file and with the same name. Should delete dir1/* and add\n     * dir1/test.txt at the end\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 47)",
        "(line 142,col 9)-(line 142,col 39)",
        "(line 143,col 9)-(line 143,col 38)",
        "(line 144,col 9)-(line 144,col 58)",
        "(line 145,col 9)-(line 145,col 30)",
        "(line 146,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToZip()",
      "begin_line": 181,
      "end_line": 216,
      "comment": "\n     * Adds a file to a zip archive. Deletes an other file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 47)",
        "(line 184,col 9)-(line 184,col 39)",
        "(line 185,col 9)-(line 185,col 38)",
        "(line 186,col 9)-(line 186,col 58)",
        "(line 187,col 9)-(line 187,col 30)",
        "(line 188,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteAdd()",
      "begin_line": 224,
      "end_line": 259,
      "comment": "\n     * add blub/test.txt + delete blub Should add blub/test.txt and delete it\n     * afterwards. In this example, the zip archive should stay untouched.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 47)",
        "(line 227,col 9)-(line 227,col 39)",
        "(line 228,col 9)-(line 228,col 38)",
        "(line 229,col 9)-(line 229,col 58)",
        "(line 230,col 9)-(line 230,col 30)",
        "(line 231,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddDelete()",
      "begin_line": 267,
      "end_line": 304,
      "comment": "\n     * delete bla + add bla/test.txt + delete bla Deletes dir1/* first, then\n     * surpresses the add of bla.txt cause there is a delete operation later.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 47)",
        "(line 270,col 9)-(line 270,col 39)",
        "(line 271,col 9)-(line 271,col 38)",
        "(line 272,col 9)-(line 272,col 58)",
        "(line 273,col 9)-(line 273,col 30)",
        "(line 274,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 303,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromZip()",
      "begin_line": 311,
      "end_line": 340,
      "comment": "\n     * Simple Delete from a zip file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 39)",
        "(line 313,col 9)-(line 313,col 38)",
        "(line 314,col 9)-(line 314,col 25)",
        "(line 315,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 336,col 40)",
        "(line 337,col 9)-(line 337,col 34)",
        "(line 339,col 9)-(line 339,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromTar()",
      "begin_line": 347,
      "end_line": 373,
      "comment": "\n     * Simple delete from a tar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 39)",
        "(line 349,col 9)-(line 349,col 38)",
        "(line 350,col 9)-(line 350,col 25)",
        "(line 351,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 40)",
        "(line 371,col 9)-(line 371,col 34)",
        "(line 372,col 9)-(line 372,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromJar()",
      "begin_line": 380,
      "end_line": 409,
      "comment": "\n     * Simple delete from a jar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 39)",
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 383,col 25)",
        "(line 384,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 40)",
        "(line 407,col 9)-(line 407,col 34)",
        "(line 408,col 9)-(line 408,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToTar()",
      "begin_line": 411,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 39)",
        "(line 413,col 9)-(line 413,col 38)",
        "(line 414,col 9)-(line 414,col 25)",
        "(line 415,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 40)",
        "(line 449,col 9)-(line 449,col 34)",
        "(line 450,col 9)-(line 450,col 42)",
        "(line 451,col 9)-(line 451,col 105)",
        "(line 452,col 9)-(line 452,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToJar()",
      "begin_line": 460,
      "end_line": 494,
      "comment": "\n     * Delete from a jar file and add another file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 39)",
        "(line 462,col 9)-(line 462,col 38)",
        "(line 463,col 9)-(line 463,col 25)",
        "(line 464,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 40)",
        "(line 491,col 9)-(line 491,col 34)",
        "(line 492,col 9)-(line 492,col 42)",
        "(line 493,col 9)-(line 493,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.XtestDeleteFromAr()",
      "begin_line": 501,
      "end_line": 530,
      "comment": "\n     * Simple delete from an ar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 39)",
        "(line 503,col 9)-(line 503,col 38)",
        "(line 504,col 9)-(line 504,col 25)",
        "(line 505,col 9)-(line 523,col 9)",
        "(line 527,col 9)-(line 527,col 40)",
        "(line 528,col 9)-(line 528,col 34)",
        "(line 529,col 9)-(line 529,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.XtestDeleteFromAndAddToAr()",
      "begin_line": 537,
      "end_line": 572,
      "comment": "\n     * Deletes a file from an AR-archive and adds another\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 39)",
        "(line 539,col 9)-(line 539,col 38)",
        "(line 540,col 9)-(line 540,col 25)",
        "(line 541,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 51)",
        "(line 568,col 9)-(line 568,col 40)",
        "(line 569,col 9)-(line 569,col 34)",
        "(line 570,col 9)-(line 570,col 33)",
        "(line 571,col 9)-(line 571,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testRenameAndDelete()",
      "begin_line": 582,
      "end_line": 583,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * mv dir1/test.text dir2/test.txt + delete dir1 Moves the file to dir2 and\n     * deletes everything in dir1\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddMoveDelete()",
      "begin_line": 595,
      "end_line": 596,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * add dir1/bla.txt + mv dir1/test.text dir2/test.txt + delete dir1\n     * \n     * Add dir1/bla.txt should be surpressed. All other dir1 files will be\n     * deleted, except dir1/test.text will be moved\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddToEmptyArchive()",
      "begin_line": 603,
      "end_line": 603,
      "comment": "\n     * Check can add a file to an empty archive.\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddToOneFileArchive()",
      "begin_line": 648,
      "end_line": 648,
      "comment": "\n     * Check can delete and add a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteToOneFileArchive()",
      "begin_line": 695,
      "end_line": 733,
      "comment": "\n     * Check can add and delete a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 58)",
        "(line 698,col 9)-(line 698,col 39)",
        "(line 699,col 9)-(line 699,col 38)",
        "(line 700,col 9)-(line 700,col 30)",
        "(line 701,col 9)-(line 701,col 58)",
        "(line 702,col 9)-(line 702,col 30)",
        "(line 703,col 9)-(line 703,col 44)",
        "(line 704,col 9)-(line 730,col 9)",
        "(line 732,col 9)-(line 732,col 54)"
      ]
    }
  ]
}