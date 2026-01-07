{
  "filepath": "/tmp/Compress-45b/src/test/java/org/apache/commons/compress/changes/ChangeSetTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSetTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 49,
      "end_line": 1296,
      "comment": "\n * Checks several ChangeSet business logics.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.archiveListDeleteDir(java.lang.String)",
      "begin_line": 52,
      "end_line": 60,
      "comment": " Delete a directory tree",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 59)",
        "(line 54,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.archiveListDelete(java.lang.String)",
      "begin_line": 63,
      "end_line": 71,
      "comment": " Delete a single file",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 59)",
        "(line 65,col 9)-(line 70,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddChangeTwice()",
      "begin_line": 80,
      "end_line": 106,
      "comment": "\n     * Adds an ArchiveEntry with the same name two times.\n     * Only the latest addition should be found in the ChangeSet,\n     * the first add should be replaced.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 30)",
        "(line 83,col 9)-(line 83,col 31)",
        "(line 84,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddChangeTwiceWithoutReplace()",
      "begin_line": 115,
      "end_line": 141,
      "comment": "\n     * Adds an ArchiveEntry with the same name two times.\n     * Only the first addition should be found in the ChangeSet,\n     * the second add should never be added since replace \u003d false\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 30)",
        "(line 118,col 9)-(line 118,col 31)",
        "(line 119,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir()",
      "begin_line": 151,
      "end_line": 185,
      "comment": "\n     * Tries to delete the folder \"bla\" from an archive file. This should result in\n     * the deletion of bla/*, which actually means bla/test4.xml should be\n     * removed from the archive. The file something/bla (without ending, named\n     * like the folder) should not be deleted.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 42)",
        "(line 154,col 9)-(line 154,col 59)",
        "(line 156,col 9)-(line 156,col 39)",
        "(line 157,col 9)-(line 157,col 38)",
        "(line 158,col 9)-(line 158,col 73)",
        "(line 159,col 9)-(line 159,col 30)",
        "(line 160,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir2()",
      "begin_line": 193,
      "end_line": 227,
      "comment": "\n     * Tries to delete the folder \"la\" from an archive file. This should result in\n     * the deletion of la/*, which should not match any files/folders.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 42)",
        "(line 196,col 9)-(line 196,col 59)",
        "(line 198,col 9)-(line 198,col 39)",
        "(line 199,col 9)-(line 199,col 38)",
        "(line 200,col 9)-(line 200,col 73)",
        "(line 201,col 9)-(line 201,col 30)",
        "(line 202,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir3()",
      "begin_line": 235,
      "end_line": 269,
      "comment": "\n     * Tries to delete the folder \"test.txt\" from an archive file.\n     * This should not match any files/folders.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 42)",
        "(line 238,col 9)-(line 238,col 59)",
        "(line 240,col 9)-(line 240,col 39)",
        "(line 241,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 242,col 73)",
        "(line 243,col 9)-(line 243,col 30)",
        "(line 244,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 268,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile()",
      "begin_line": 277,
      "end_line": 312,
      "comment": "\n     * Tries to delete the file \"bla/test5.xml\" from an archive. This should\n     * result in the deletion of \"bla/test5.xml\".\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 42)",
        "(line 280,col 9)-(line 280,col 59)",
        "(line 282,col 9)-(line 282,col 39)",
        "(line 283,col 9)-(line 283,col 38)",
        "(line 284,col 9)-(line 284,col 73)",
        "(line 285,col 9)-(line 285,col 30)",
        "(line 286,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 311,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile2()",
      "begin_line": 320,
      "end_line": 355,
      "comment": "\n     * Tries to delete the file \"bla\" from an archive. This should\n     * result in the deletion of nothing.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 42)",
        "(line 323,col 9)-(line 323,col 59)",
        "(line 325,col 9)-(line 325,col 39)",
        "(line 326,col 9)-(line 326,col 38)",
        "(line 327,col 9)-(line 327,col 73)",
        "(line 328,col 9)-(line 328,col 30)",
        "(line 329,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 354,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAddSame()",
      "begin_line": 364,
      "end_line": 429,
      "comment": "\n     * Tries to delete and then add a file with the same name.\n     * Should delete test/test3.xml and adds test.txt with the name\n     * test/test3.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 41)",
        "(line 367,col 9)-(line 367,col 59)",
        "(line 369,col 9)-(line 369,col 39)",
        "(line 370,col 9)-(line 370,col 38)",
        "(line 371,col 9)-(line 371,col 73)",
        "(line 372,col 9)-(line 372,col 30)",
        "(line 374,col 9)-(line 374,col 28)",
        "(line 375,col 9)-(line 403,col 9)",
        "(line 406,col 9)-(line 406,col 37)",
        "(line 407,col 9)-(line 407,col 26)",
        "(line 408,col 9)-(line 428,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testChangeSetResults()",
      "begin_line": 436,
      "end_line": 491,
      "comment": "\n     * Checks for the correct ChangeSetResults\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 42)",
        "(line 439,col 9)-(line 439,col 59)",
        "(line 441,col 9)-(line 441,col 39)",
        "(line 442,col 9)-(line 442,col 38)",
        "(line 443,col 9)-(line 443,col 73)",
        "(line 444,col 9)-(line 444,col 30)",
        "(line 445,col 9)-(line 488,col 9)",
        "(line 490,col 9)-(line 490,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAdd()",
      "begin_line": 500,
      "end_line": 540,
      "comment": "\n     * Tries to delete a directory with a file and adds a new directory with a\n     * new file and with the same name. Should delete dir1/* and add\n     * dir1/test.txt at the end\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 42)",
        "(line 503,col 9)-(line 503,col 59)",
        "(line 505,col 9)-(line 505,col 39)",
        "(line 506,col 9)-(line 506,col 38)",
        "(line 507,col 9)-(line 507,col 73)",
        "(line 508,col 9)-(line 508,col 30)",
        "(line 509,col 9)-(line 537,col 9)",
        "(line 539,col 9)-(line 539,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToZip()",
      "begin_line": 547,
      "end_line": 587,
      "comment": "\n     * Adds a file to a zip archive. Deletes an other file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 41)",
        "(line 550,col 9)-(line 550,col 59)",
        "(line 552,col 9)-(line 552,col 39)",
        "(line 553,col 9)-(line 553,col 38)",
        "(line 554,col 9)-(line 554,col 73)",
        "(line 555,col 9)-(line 555,col 30)",
        "(line 556,col 9)-(line 584,col 9)",
        "(line 586,col 9)-(line 586,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToZipUsingZipFilePerform()",
      "begin_line": 594,
      "end_line": 632,
      "comment": "\n     * Adds a file to a zip archive. Deletes an other file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 41)",
        "(line 597,col 9)-(line 597,col 59)",
        "(line 599,col 9)-(line 599,col 39)",
        "(line 600,col 9)-(line 600,col 27)",
        "(line 601,col 9)-(line 601,col 73)",
        "(line 602,col 9)-(line 602,col 30)",
        "(line 603,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteAdd()",
      "begin_line": 640,
      "end_line": 681,
      "comment": "\n     * add blub/test.txt + delete blub Should add blub/test.txt and delete it\n     * afterwards. In this example, the archive should stay untouched.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 42)",
        "(line 643,col 9)-(line 643,col 59)",
        "(line 645,col 9)-(line 645,col 39)",
        "(line 646,col 9)-(line 646,col 38)",
        "(line 647,col 9)-(line 647,col 73)",
        "(line 648,col 9)-(line 648,col 30)",
        "(line 649,col 9)-(line 678,col 9)",
        "(line 680,col 9)-(line 680,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddDelete()",
      "begin_line": 689,
      "end_line": 732,
      "comment": "\n     * delete bla + add bla/test.txt + delete bla Deletes dir1/* first, then\n     * suppresses the add of bla.txt because there is a delete operation later.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 42)",
        "(line 692,col 9)-(line 692,col 59)",
        "(line 694,col 9)-(line 694,col 39)",
        "(line 695,col 9)-(line 695,col 38)",
        "(line 696,col 9)-(line 696,col 73)",
        "(line 697,col 9)-(line 697,col 30)",
        "(line 698,col 9)-(line 729,col 9)",
        "(line 731,col 9)-(line 731,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromZip()",
      "begin_line": 739,
      "end_line": 773,
      "comment": "\n     * Simple Delete from a zip file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 39)",
        "(line 742,col 9)-(line 742,col 38)",
        "(line 743,col 9)-(line 743,col 25)",
        "(line 744,col 9)-(line 767,col 9)",
        "(line 769,col 9)-(line 769,col 56)",
        "(line 770,col 9)-(line 770,col 34)",
        "(line 772,col 9)-(line 772,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromTar()",
      "begin_line": 780,
      "end_line": 811,
      "comment": "\n     * Simple delete from a tar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 39)",
        "(line 783,col 9)-(line 783,col 38)",
        "(line 784,col 9)-(line 784,col 25)",
        "(line 785,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 56)",
        "(line 809,col 9)-(line 809,col 34)",
        "(line 810,col 9)-(line 810,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromJar()",
      "begin_line": 818,
      "end_line": 852,
      "comment": "\n     * Simple delete from a jar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 39)",
        "(line 821,col 9)-(line 821,col 38)",
        "(line 822,col 9)-(line 822,col 25)",
        "(line 823,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 56)",
        "(line 850,col 9)-(line 850,col 34)",
        "(line 851,col 9)-(line 851,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToTar()",
      "begin_line": 854,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 39)",
        "(line 857,col 9)-(line 857,col 38)",
        "(line 858,col 9)-(line 858,col 25)",
        "(line 859,col 9)-(line 895,col 9)",
        "(line 896,col 9)-(line 896,col 56)",
        "(line 897,col 9)-(line 897,col 34)",
        "(line 898,col 9)-(line 898,col 42)",
        "(line 899,col 9)-(line 899,col 105)",
        "(line 900,col 9)-(line 900,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToJar()",
      "begin_line": 908,
      "end_line": 947,
      "comment": "\n     * Delete from a jar file and add another file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 39)",
        "(line 911,col 9)-(line 911,col 38)",
        "(line 912,col 9)-(line 912,col 25)",
        "(line 913,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 943,col 56)",
        "(line 944,col 9)-(line 944,col 34)",
        "(line 945,col 9)-(line 945,col 42)",
        "(line 946,col 9)-(line 946,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAr()",
      "begin_line": 954,
      "end_line": 986,
      "comment": "\n     * Simple delete from an ar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 39)",
        "(line 957,col 9)-(line 957,col 38)",
        "(line 958,col 9)-(line 958,col 25)",
        "(line 959,col 9)-(line 981,col 9)",
        "(line 983,col 9)-(line 983,col 56)",
        "(line 984,col 9)-(line 984,col 34)",
        "(line 985,col 9)-(line 985,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToAr()",
      "begin_line": 993,
      "end_line": 1032,
      "comment": "\n     * Deletes a file from an AR-archive and adds another\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 39)",
        "(line 996,col 9)-(line 996,col 38)",
        "(line 997,col 9)-(line 997,col 25)",
        "(line 998,col 9)-(line 1027,col 9)",
        "(line 1028,col 9)-(line 1028,col 56)",
        "(line 1029,col 9)-(line 1029,col 34)",
        "(line 1030,col 9)-(line 1030,col 33)",
        "(line 1031,col 9)-(line 1031,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testRenameAndDelete()",
      "begin_line": 1042,
      "end_line": 1044,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * mv dir1/test.text dir2/test.txt + delete dir1 Moves the file to dir2 and\n     * deletes everything in dir1\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddMoveDelete()",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * add dir1/bla.txt + mv dir1/test.text dir2/test.txt + delete dir1\n     * \n     * Add dir1/bla.txt should be surpressed. All other dir1 files will be\n     * deleted, except dir1/test.text will be moved\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddToEmptyArchive()",
      "begin_line": 1065,
      "end_line": 1104,
      "comment": "\n     * Check can add a file to an empty archive.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1067,col 9)-(line 1067,col 41)",
        "(line 1068,col 9)-(line 1068,col 64)",
        "(line 1070,col 9)-(line 1070,col 39)",
        "(line 1071,col 9)-(line 1071,col 38)",
        "(line 1072,col 9)-(line 1072,col 30)",
        "(line 1073,col 9)-(line 1073,col 73)",
        "(line 1074,col 9)-(line 1074,col 30)",
        "(line 1075,col 9)-(line 1075,col 50)",
        "(line 1076,col 9)-(line 1101,col 9)",
        "(line 1103,col 9)-(line 1103,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddToOneFileArchive()",
      "begin_line": 1111,
      "end_line": 1153,
      "comment": "\n     * Check can delete and add a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1113,col 9)-(line 1113,col 41)",
        "(line 1114,col 9)-(line 1114,col 70)",
        "(line 1116,col 9)-(line 1116,col 39)",
        "(line 1117,col 9)-(line 1117,col 38)",
        "(line 1118,col 9)-(line 1118,col 30)",
        "(line 1119,col 9)-(line 1119,col 73)",
        "(line 1120,col 9)-(line 1120,col 30)",
        "(line 1121,col 9)-(line 1121,col 50)",
        "(line 1122,col 9)-(line 1150,col 9)",
        "(line 1152,col 9)-(line 1152,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteToOneFileArchive()",
      "begin_line": 1160,
      "end_line": 1202,
      "comment": "\n     * Check can add and delete a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 42)",
        "(line 1163,col 9)-(line 1163,col 70)",
        "(line 1165,col 9)-(line 1165,col 39)",
        "(line 1166,col 9)-(line 1166,col 38)",
        "(line 1167,col 9)-(line 1167,col 30)",
        "(line 1168,col 9)-(line 1168,col 73)",
        "(line 1169,col 9)-(line 1169,col 30)",
        "(line 1170,col 9)-(line 1170,col 50)",
        "(line 1171,col 9)-(line 1199,col 9)",
        "(line 1201,col 9)-(line 1201,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddAllreadyExistingWithReplaceTrue()",
      "begin_line": 1210,
      "end_line": 1247,
      "comment": "\n     * Adds a file with the same filename as an existing file from the stream.\n     * Should lead to a replacement.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1212,col 9)-(line 1212,col 41)",
        "(line 1213,col 9)-(line 1213,col 59)",
        "(line 1215,col 9)-(line 1215,col 39)",
        "(line 1216,col 9)-(line 1216,col 38)",
        "(line 1217,col 9)-(line 1217,col 73)",
        "(line 1218,col 9)-(line 1218,col 30)",
        "(line 1219,col 9)-(line 1244,col 9)",
        "(line 1246,col 9)-(line 1246,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddAllreadyExistingWithReplaceFalse()",
      "begin_line": 1255,
      "end_line": 1294,
      "comment": "\n     * Adds a file with the same filename as an existing file from the stream.\n     * Should lead to a replacement.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 41)",
        "(line 1258,col 9)-(line 1258,col 59)",
        "(line 1260,col 9)-(line 1260,col 39)",
        "(line 1261,col 9)-(line 1261,col 38)",
        "(line 1262,col 9)-(line 1262,col 73)",
        "(line 1263,col 9)-(line 1263,col 30)",
        "(line 1264,col 9)-(line 1291,col 9)",
        "(line 1293,col 9)-(line 1293,col 54)"
      ]
    }
  ]
}