{
  "filepath": "/tmp/Compress-1b/src/test/java/org/apache/commons/compress/changes/ChangeSetTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSetTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 41,
      "end_line": 629,
      "comment": "\n * Checks several ChangeSet business logics.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir()",
      "begin_line": 50,
      "end_line": 85,
      "comment": "\n     * Tries to delete the folder \"bla\" from a zip file. This should result in\n     * the deletion of bla/*, which actually means bla/test4.xml should be\n     * removed from this zipfile. The file something/bla (without ending, named\n     * like the folder) should not be deleted.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 47)",
        "(line 53,col 9)-(line 53,col 39)",
        "(line 54,col 9)-(line 54,col 38)",
        "(line 55,col 9)-(line 55,col 58)",
        "(line 56,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 40)",
        "(line 77,col 9)-(line 77,col 43)",
        "(line 78,col 9)-(line 78,col 43)",
        "(line 79,col 9)-(line 79,col 39)",
        "(line 80,col 9)-(line 80,col 33)",
        "(line 81,col 9)-(line 81,col 38)",
        "(line 82,col 9)-(line 82,col 45)",
        "(line 84,col 9)-(line 84,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile()",
      "begin_line": 93,
      "end_line": 129,
      "comment": "\n     * Tries to delete the file \"bla/test5.xml\" from a zip file. This should\n     * result in the deletion of \"bla/test5.xml\".\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 47)",
        "(line 96,col 9)-(line 96,col 39)",
        "(line 97,col 9)-(line 97,col 38)",
        "(line 98,col 9)-(line 98,col 58)",
        "(line 99,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 40)",
        "(line 120,col 9)-(line 120,col 43)",
        "(line 121,col 9)-(line 121,col 43)",
        "(line 122,col 9)-(line 122,col 39)",
        "(line 123,col 9)-(line 123,col 33)",
        "(line 124,col 9)-(line 124,col 38)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 38)",
        "(line 127,col 9)-(line 127,col 46)",
        "(line 128,col 9)-(line 128,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAdd()",
      "begin_line": 138,
      "end_line": 179,
      "comment": "\n     * Tries to delete a directory with a file and adds a new directory with a\n     * new file and with the same name. Should delete dir1/* and add\n     * dir1/test.txt at the end\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 47)",
        "(line 141,col 9)-(line 141,col 39)",
        "(line 142,col 9)-(line 142,col 38)",
        "(line 143,col 9)-(line 143,col 58)",
        "(line 144,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 40)",
        "(line 170,col 9)-(line 170,col 43)",
        "(line 171,col 9)-(line 171,col 43)",
        "(line 172,col 9)-(line 172,col 39)",
        "(line 173,col 9)-(line 173,col 33)",
        "(line 174,col 9)-(line 174,col 38)",
        "(line 175,col 9)-(line 175,col 37)",
        "(line 176,col 9)-(line 176,col 45)",
        "(line 178,col 9)-(line 178,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToZip()",
      "begin_line": 186,
      "end_line": 229,
      "comment": "\n     * Adds a file to a zip archive. Deletes an other file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 47)",
        "(line 189,col 9)-(line 189,col 39)",
        "(line 190,col 9)-(line 190,col 38)",
        "(line 191,col 9)-(line 191,col 58)",
        "(line 192,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 217,col 40)",
        "(line 218,col 9)-(line 218,col 43)",
        "(line 219,col 9)-(line 219,col 39)",
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 221,col 38)",
        "(line 222,col 9)-(line 222,col 46)",
        "(line 223,col 9)-(line 223,col 33)",
        "(line 224,col 9)-(line 224,col 38)",
        "(line 225,col 9)-(line 225,col 38)",
        "(line 226,col 9)-(line 226,col 45)",
        "(line 228,col 9)-(line 228,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteAdd()",
      "begin_line": 237,
      "end_line": 280,
      "comment": "\n     * add blub/test.txt + delete blub Should add dir1/test.txt and delete it\n     * afterwards. In this example, the zip archive should stay untouched.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 47)",
        "(line 240,col 9)-(line 240,col 39)",
        "(line 241,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 242,col 58)",
        "(line 243,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 268,col 40)",
        "(line 269,col 9)-(line 269,col 43)",
        "(line 270,col 9)-(line 270,col 43)",
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 33)",
        "(line 273,col 9)-(line 273,col 38)",
        "(line 274,col 9)-(line 274,col 46)",
        "(line 275,col 9)-(line 275,col 38)",
        "(line 276,col 9)-(line 276,col 38)",
        "(line 277,col 9)-(line 277,col 45)",
        "(line 279,col 9)-(line 279,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddDelete()",
      "begin_line": 288,
      "end_line": 330,
      "comment": "\n     * delete bla + add bla/test.txt + delete bla Deletes dir1/* first, then\n     * surpresses the add of bla.txt cause there is a delete operation later.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 47)",
        "(line 291,col 9)-(line 291,col 39)",
        "(line 292,col 9)-(line 292,col 38)",
        "(line 293,col 9)-(line 293,col 58)",
        "(line 294,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 40)",
        "(line 322,col 9)-(line 322,col 43)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 324,col 39)",
        "(line 325,col 9)-(line 325,col 33)",
        "(line 326,col 9)-(line 326,col 38)",
        "(line 327,col 9)-(line 327,col 45)",
        "(line 329,col 9)-(line 329,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromZip()",
      "begin_line": 337,
      "end_line": 366,
      "comment": "\n     * Simple Delete from a zip file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 39)",
        "(line 339,col 9)-(line 339,col 38)",
        "(line 340,col 9)-(line 340,col 25)",
        "(line 341,col 9)-(line 360,col 9)",
        "(line 362,col 9)-(line 362,col 40)",
        "(line 363,col 9)-(line 363,col 34)",
        "(line 365,col 9)-(line 365,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromTar()",
      "begin_line": 373,
      "end_line": 400,
      "comment": "\n     * Simple delete from a tar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 39)",
        "(line 375,col 9)-(line 375,col 38)",
        "(line 376,col 9)-(line 376,col 25)",
        "(line 377,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 40)",
        "(line 398,col 9)-(line 398,col 34)",
        "(line 399,col 9)-(line 399,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromJar()",
      "begin_line": 407,
      "end_line": 437,
      "comment": "\n     * Simple delete from a jar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 39)",
        "(line 409,col 9)-(line 409,col 38)",
        "(line 410,col 9)-(line 410,col 25)",
        "(line 411,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 40)",
        "(line 435,col 9)-(line 435,col 34)",
        "(line 436,col 9)-(line 436,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToTar()",
      "begin_line": 439,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 39)",
        "(line 441,col 9)-(line 441,col 38)",
        "(line 442,col 9)-(line 442,col 25)",
        "(line 443,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 40)",
        "(line 478,col 9)-(line 478,col 34)",
        "(line 479,col 9)-(line 479,col 42)",
        "(line 481,col 9)-(line 482,col 76)",
        "(line 483,col 9)-(line 483,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToJar()",
      "begin_line": 491,
      "end_line": 526,
      "comment": "\n     * Delete from a jar file and add another file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 39)",
        "(line 493,col 9)-(line 493,col 38)",
        "(line 494,col 9)-(line 494,col 25)",
        "(line 495,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 40)",
        "(line 523,col 9)-(line 523,col 34)",
        "(line 524,col 9)-(line 524,col 42)",
        "(line 525,col 9)-(line 525,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.XtestDeleteFromAr()",
      "begin_line": 533,
      "end_line": 562,
      "comment": "\n     * Simple delete from an ar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 39)",
        "(line 535,col 9)-(line 535,col 38)",
        "(line 536,col 9)-(line 536,col 25)",
        "(line 537,col 9)-(line 555,col 9)",
        "(line 559,col 9)-(line 559,col 40)",
        "(line 560,col 9)-(line 560,col 34)",
        "(line 561,col 9)-(line 561,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.XtestDeleteFromAndAddToAr()",
      "begin_line": 569,
      "end_line": 604,
      "comment": "\n     * Deletes a file from an AR-archive and adds another\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 39)",
        "(line 571,col 9)-(line 571,col 38)",
        "(line 572,col 9)-(line 572,col 25)",
        "(line 573,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 51)",
        "(line 600,col 9)-(line 600,col 40)",
        "(line 601,col 9)-(line 601,col 34)",
        "(line 602,col 9)-(line 602,col 33)",
        "(line 603,col 9)-(line 603,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testRenameAndDelete()",
      "begin_line": 614,
      "end_line": 615,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * mv dir1/test.text dir2/test.txt + delete dir1 Moves the file to dir2 and\n     * deletes everything in dir1\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddMoveDelete()",
      "begin_line": 627,
      "end_line": 628,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * add dir1/bla.txt + mv dir1/test.text dir2/test.txt + delete dir1\n     * \n     * Add dir1/bla.txt should be surpressed. All other dir1 files will be\n     * deleted, except dir1/test.text will be moved\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    }
  ]
}