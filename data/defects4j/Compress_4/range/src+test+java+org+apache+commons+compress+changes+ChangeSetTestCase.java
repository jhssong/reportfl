{
  "filepath": "/tmp/Compress-4b/src/test/java/org/apache/commons/compress/changes/ChangeSetTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSetTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 45,
      "end_line": 1173,
      "comment": "\n * Checks several ChangeSet business logics.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.archiveListDeleteDir(java.lang.String)",
      "begin_line": 48,
      "end_line": 56,
      "comment": " Delete a directory tree",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 45)",
        "(line 50,col 9)-(line 55,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.archiveListDelete(java.lang.String)",
      "begin_line": 59,
      "end_line": 67,
      "comment": " Delete a single file",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 45)",
        "(line 61,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddChangeTwice()",
      "begin_line": 76,
      "end_line": 99,
      "comment": "\n     * Adds an ArchiveEntry with the same name two times.\n     * Only the latest addition should be found in the ChangeSet,\n     * the first add should be replaced.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 30)",
        "(line 78,col 9)-(line 78,col 31)",
        "(line 79,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddChangeTwiceWithoutReplace()",
      "begin_line": 108,
      "end_line": 131,
      "comment": "\n     * Adds an ArchiveEntry with the same name two times.\n     * Only the first addition should be found in the ChangeSet,\n     * the second add should never be added since replace \u003d false\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 30)",
        "(line 110,col 9)-(line 110,col 31)",
        "(line 111,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir()",
      "begin_line": 141,
      "end_line": 172,
      "comment": "\n     * Tries to delete the folder \"bla\" from an archive file. This should result in\n     * the deletion of bla/*, which actually means bla/test4.xml should be\n     * removed from the archive. The file something/bla (without ending, named\n     * like the folder) should not be deleted.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 42)",
        "(line 143,col 9)-(line 143,col 53)",
        "(line 145,col 9)-(line 145,col 39)",
        "(line 146,col 9)-(line 146,col 38)",
        "(line 147,col 9)-(line 147,col 67)",
        "(line 148,col 9)-(line 148,col 30)",
        "(line 149,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir2()",
      "begin_line": 180,
      "end_line": 211,
      "comment": "\n     * Tries to delete the folder \"la\" from an archive file. This should result in\n     * the deletion of la/*, which should not match any files/folders.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 42)",
        "(line 182,col 9)-(line 182,col 53)",
        "(line 184,col 9)-(line 184,col 39)",
        "(line 185,col 9)-(line 185,col 38)",
        "(line 186,col 9)-(line 186,col 67)",
        "(line 187,col 9)-(line 187,col 30)",
        "(line 188,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir3()",
      "begin_line": 219,
      "end_line": 250,
      "comment": "\n     * Tries to delete the folder \"test.txt\" from an archive file.\n     * This should not match any files/folders.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 42)",
        "(line 221,col 9)-(line 221,col 53)",
        "(line 223,col 9)-(line 223,col 39)",
        "(line 224,col 9)-(line 224,col 38)",
        "(line 225,col 9)-(line 225,col 67)",
        "(line 226,col 9)-(line 226,col 30)",
        "(line 227,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile()",
      "begin_line": 258,
      "end_line": 290,
      "comment": "\n     * Tries to delete the file \"bla/test5.xml\" from an archive. This should\n     * result in the deletion of \"bla/test5.xml\".\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 42)",
        "(line 260,col 9)-(line 260,col 53)",
        "(line 262,col 9)-(line 262,col 39)",
        "(line 263,col 9)-(line 263,col 38)",
        "(line 264,col 9)-(line 264,col 67)",
        "(line 265,col 9)-(line 265,col 30)",
        "(line 266,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile2()",
      "begin_line": 298,
      "end_line": 330,
      "comment": "\n     * Tries to delete the file \"bla\" from an archive. This should\n     * result in the deletion of nothing.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 42)",
        "(line 300,col 9)-(line 300,col 53)",
        "(line 302,col 9)-(line 302,col 39)",
        "(line 303,col 9)-(line 303,col 38)",
        "(line 304,col 9)-(line 304,col 67)",
        "(line 305,col 9)-(line 305,col 30)",
        "(line 306,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAddSame()",
      "begin_line": 339,
      "end_line": 398,
      "comment": "\n     * Tries to delete and then add a file with the same name.\n     * Should delete test/test3.xml and adds test.txt with the name\n     * test/test3.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 41)",
        "(line 341,col 9)-(line 341,col 53)",
        "(line 343,col 9)-(line 343,col 39)",
        "(line 344,col 9)-(line 344,col 38)",
        "(line 345,col 9)-(line 345,col 67)",
        "(line 346,col 9)-(line 346,col 30)",
        "(line 348,col 9)-(line 348,col 28)",
        "(line 349,col 9)-(line 375,col 9)",
        "(line 378,col 9)-(line 378,col 37)",
        "(line 379,col 9)-(line 379,col 26)",
        "(line 380,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testChangeSetResults()",
      "begin_line": 405,
      "end_line": 457,
      "comment": "\n     * Checks for the correct ChangeSetResults\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 42)",
        "(line 407,col 9)-(line 407,col 53)",
        "(line 409,col 9)-(line 409,col 39)",
        "(line 410,col 9)-(line 410,col 38)",
        "(line 411,col 9)-(line 411,col 67)",
        "(line 412,col 9)-(line 412,col 30)",
        "(line 413,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 456,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAdd()",
      "begin_line": 466,
      "end_line": 503,
      "comment": "\n     * Tries to delete a directory with a file and adds a new directory with a\n     * new file and with the same name. Should delete dir1/* and add\n     * dir1/test.txt at the end\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 42)",
        "(line 468,col 9)-(line 468,col 53)",
        "(line 470,col 9)-(line 470,col 39)",
        "(line 471,col 9)-(line 471,col 38)",
        "(line 472,col 9)-(line 472,col 67)",
        "(line 473,col 9)-(line 473,col 30)",
        "(line 474,col 9)-(line 500,col 9)",
        "(line 502,col 9)-(line 502,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToZip()",
      "begin_line": 510,
      "end_line": 547,
      "comment": "\n     * Adds a file to a zip archive. Deletes an other file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 41)",
        "(line 512,col 9)-(line 512,col 53)",
        "(line 514,col 9)-(line 514,col 39)",
        "(line 515,col 9)-(line 515,col 38)",
        "(line 516,col 9)-(line 516,col 67)",
        "(line 517,col 9)-(line 517,col 30)",
        "(line 518,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 546,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteAdd()",
      "begin_line": 555,
      "end_line": 593,
      "comment": "\n     * add blub/test.txt + delete blub Should add blub/test.txt and delete it\n     * afterwards. In this example, the archive should stay untouched.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 42)",
        "(line 557,col 9)-(line 557,col 53)",
        "(line 559,col 9)-(line 559,col 39)",
        "(line 560,col 9)-(line 560,col 38)",
        "(line 561,col 9)-(line 561,col 67)",
        "(line 562,col 9)-(line 562,col 30)",
        "(line 563,col 9)-(line 590,col 9)",
        "(line 592,col 9)-(line 592,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddDelete()",
      "begin_line": 601,
      "end_line": 641,
      "comment": "\n     * delete bla + add bla/test.txt + delete bla Deletes dir1/* first, then\n     * suppresses the add of bla.txt because there is a delete operation later.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 42)",
        "(line 603,col 9)-(line 603,col 53)",
        "(line 605,col 9)-(line 605,col 39)",
        "(line 606,col 9)-(line 606,col 38)",
        "(line 607,col 9)-(line 607,col 67)",
        "(line 608,col 9)-(line 608,col 30)",
        "(line 609,col 9)-(line 638,col 9)",
        "(line 640,col 9)-(line 640,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromZip()",
      "begin_line": 648,
      "end_line": 679,
      "comment": "\n     * Simple Delete from a zip file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 39)",
        "(line 650,col 9)-(line 650,col 38)",
        "(line 651,col 9)-(line 651,col 25)",
        "(line 652,col 9)-(line 673,col 9)",
        "(line 675,col 9)-(line 675,col 40)",
        "(line 676,col 9)-(line 676,col 34)",
        "(line 678,col 9)-(line 678,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromTar()",
      "begin_line": 686,
      "end_line": 714,
      "comment": "\n     * Simple delete from a tar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 39)",
        "(line 688,col 9)-(line 688,col 38)",
        "(line 689,col 9)-(line 689,col 25)",
        "(line 690,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 40)",
        "(line 712,col 9)-(line 712,col 34)",
        "(line 713,col 9)-(line 713,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromJar()",
      "begin_line": 721,
      "end_line": 752,
      "comment": "\n     * Simple delete from a jar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 39)",
        "(line 723,col 9)-(line 723,col 38)",
        "(line 724,col 9)-(line 724,col 25)",
        "(line 725,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 749,col 40)",
        "(line 750,col 9)-(line 750,col 34)",
        "(line 751,col 9)-(line 751,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToTar()",
      "begin_line": 754,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 39)",
        "(line 756,col 9)-(line 756,col 38)",
        "(line 757,col 9)-(line 757,col 25)",
        "(line 758,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 793,col 40)",
        "(line 794,col 9)-(line 794,col 34)",
        "(line 795,col 9)-(line 795,col 42)",
        "(line 796,col 9)-(line 796,col 105)",
        "(line 797,col 9)-(line 797,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToJar()",
      "begin_line": 805,
      "end_line": 841,
      "comment": "\n     * Delete from a jar file and add another file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 39)",
        "(line 807,col 9)-(line 807,col 38)",
        "(line 808,col 9)-(line 808,col 25)",
        "(line 809,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 40)",
        "(line 838,col 9)-(line 838,col 34)",
        "(line 839,col 9)-(line 839,col 42)",
        "(line 840,col 9)-(line 840,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAr()",
      "begin_line": 848,
      "end_line": 877,
      "comment": "\n     * Simple delete from an ar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 39)",
        "(line 850,col 9)-(line 850,col 38)",
        "(line 851,col 9)-(line 851,col 25)",
        "(line 852,col 9)-(line 872,col 9)",
        "(line 874,col 9)-(line 874,col 40)",
        "(line 875,col 9)-(line 875,col 34)",
        "(line 876,col 9)-(line 876,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToAr()",
      "begin_line": 884,
      "end_line": 920,
      "comment": "\n     * Deletes a file from an AR-archive and adds another\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 39)",
        "(line 886,col 9)-(line 886,col 38)",
        "(line 887,col 9)-(line 887,col 25)",
        "(line 888,col 9)-(line 915,col 9)",
        "(line 916,col 9)-(line 916,col 40)",
        "(line 917,col 9)-(line 917,col 34)",
        "(line 918,col 9)-(line 918,col 33)",
        "(line 919,col 9)-(line 919,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testRenameAndDelete()",
      "begin_line": 930,
      "end_line": 931,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * mv dir1/test.text dir2/test.txt + delete dir1 Moves the file to dir2 and\n     * deletes everything in dir1\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddMoveDelete()",
      "begin_line": 943,
      "end_line": 944,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * add dir1/bla.txt + mv dir1/test.text dir2/test.txt + delete dir1\n     * \n     * Add dir1/bla.txt should be surpressed. All other dir1 files will be\n     * deleted, except dir1/test.text will be moved\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddToEmptyArchive()",
      "begin_line": 951,
      "end_line": 989,
      "comment": "\n     * Check can add a file to an empty archive.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 952,col 41)",
        "(line 953,col 9)-(line 953,col 58)",
        "(line 955,col 9)-(line 955,col 39)",
        "(line 956,col 9)-(line 956,col 38)",
        "(line 957,col 9)-(line 957,col 30)",
        "(line 958,col 9)-(line 958,col 67)",
        "(line 959,col 9)-(line 959,col 30)",
        "(line 960,col 9)-(line 960,col 44)",
        "(line 961,col 9)-(line 986,col 9)",
        "(line 988,col 9)-(line 988,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddToOneFileArchive()",
      "begin_line": 996,
      "end_line": 1037,
      "comment": "\n     * Check can delete and add a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 41)",
        "(line 998,col 9)-(line 998,col 64)",
        "(line 1000,col 9)-(line 1000,col 39)",
        "(line 1001,col 9)-(line 1001,col 38)",
        "(line 1002,col 9)-(line 1002,col 30)",
        "(line 1003,col 9)-(line 1003,col 67)",
        "(line 1004,col 9)-(line 1004,col 30)",
        "(line 1005,col 9)-(line 1005,col 44)",
        "(line 1006,col 9)-(line 1034,col 9)",
        "(line 1036,col 9)-(line 1036,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteToOneFileArchive()",
      "begin_line": 1044,
      "end_line": 1085,
      "comment": "\n     * Check can add and delete a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 42)",
        "(line 1046,col 9)-(line 1046,col 64)",
        "(line 1048,col 9)-(line 1048,col 39)",
        "(line 1049,col 9)-(line 1049,col 38)",
        "(line 1050,col 9)-(line 1050,col 30)",
        "(line 1051,col 9)-(line 1051,col 67)",
        "(line 1052,col 9)-(line 1052,col 30)",
        "(line 1053,col 9)-(line 1053,col 44)",
        "(line 1054,col 9)-(line 1082,col 9)",
        "(line 1084,col 9)-(line 1084,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddAllreadyExistingWithReplaceTrue()",
      "begin_line": 1093,
      "end_line": 1127,
      "comment": "\n     * Adds a file with the same filename as an existing file from the stream.\n     * Should lead to a replacement.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1094,col 41)",
        "(line 1095,col 9)-(line 1095,col 53)",
        "(line 1097,col 9)-(line 1097,col 39)",
        "(line 1098,col 9)-(line 1098,col 38)",
        "(line 1099,col 9)-(line 1099,col 67)",
        "(line 1100,col 9)-(line 1100,col 30)",
        "(line 1101,col 9)-(line 1124,col 9)",
        "(line 1126,col 9)-(line 1126,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddAllreadyExistingWithReplaceFalse()",
      "begin_line": 1135,
      "end_line": 1171,
      "comment": "\n     * Adds a file with the same filename as an existing file from the stream.\n     * Should lead to a replacement.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1136,col 9)-(line 1136,col 41)",
        "(line 1137,col 9)-(line 1137,col 53)",
        "(line 1139,col 9)-(line 1139,col 39)",
        "(line 1140,col 9)-(line 1140,col 38)",
        "(line 1141,col 9)-(line 1141,col 67)",
        "(line 1142,col 9)-(line 1142,col 30)",
        "(line 1143,col 9)-(line 1168,col 9)",
        "(line 1170,col 9)-(line 1170,col 54)"
      ]
    }
  ]
}