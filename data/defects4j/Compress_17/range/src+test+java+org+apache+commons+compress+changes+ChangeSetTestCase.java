{
  "filepath": "/tmp/Compress-17b/src/test/java/org/apache/commons/compress/changes/ChangeSetTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSetTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 45,
      "end_line": 1220,
      "comment": "\n * Checks several ChangeSet business logics.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.archiveListDeleteDir(java.lang.String)",
      "begin_line": 48,
      "end_line": 56,
      "comment": " Delete a directory tree",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 53)",
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
        "(line 60,col 9)-(line 60,col 53)",
        "(line 61,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddChangeTwice()",
      "begin_line": 76,
      "end_line": 101,
      "comment": "\n     * Adds an ArchiveEntry with the same name two times.\n     * Only the latest addition should be found in the ChangeSet,\n     * the first add should be replaced.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 30)",
        "(line 78,col 9)-(line 78,col 31)",
        "(line 79,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddChangeTwiceWithoutReplace()",
      "begin_line": 110,
      "end_line": 135,
      "comment": "\n     * Adds an ArchiveEntry with the same name two times.\n     * Only the first addition should be found in the ChangeSet,\n     * the second add should never be added since replace \u003d false\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 30)",
        "(line 112,col 9)-(line 112,col 31)",
        "(line 113,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir()",
      "begin_line": 145,
      "end_line": 178,
      "comment": "\n     * Tries to delete the folder \"bla\" from an archive file. This should result in\n     * the deletion of bla/*, which actually means bla/test4.xml should be\n     * removed from the archive. The file something/bla (without ending, named\n     * like the folder) should not be deleted.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 42)",
        "(line 147,col 9)-(line 147,col 53)",
        "(line 149,col 9)-(line 149,col 39)",
        "(line 150,col 9)-(line 150,col 38)",
        "(line 151,col 9)-(line 151,col 67)",
        "(line 152,col 9)-(line 152,col 30)",
        "(line 153,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 177,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir2()",
      "begin_line": 186,
      "end_line": 219,
      "comment": "\n     * Tries to delete the folder \"la\" from an archive file. This should result in\n     * the deletion of la/*, which should not match any files/folders.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 42)",
        "(line 188,col 9)-(line 188,col 53)",
        "(line 190,col 9)-(line 190,col 39)",
        "(line 191,col 9)-(line 191,col 38)",
        "(line 192,col 9)-(line 192,col 67)",
        "(line 193,col 9)-(line 193,col 30)",
        "(line 194,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir3()",
      "begin_line": 227,
      "end_line": 260,
      "comment": "\n     * Tries to delete the folder \"test.txt\" from an archive file.\n     * This should not match any files/folders.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 42)",
        "(line 229,col 9)-(line 229,col 53)",
        "(line 231,col 9)-(line 231,col 39)",
        "(line 232,col 9)-(line 232,col 38)",
        "(line 233,col 9)-(line 233,col 67)",
        "(line 234,col 9)-(line 234,col 30)",
        "(line 235,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile()",
      "begin_line": 268,
      "end_line": 302,
      "comment": "\n     * Tries to delete the file \"bla/test5.xml\" from an archive. This should\n     * result in the deletion of \"bla/test5.xml\".\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 42)",
        "(line 270,col 9)-(line 270,col 53)",
        "(line 272,col 9)-(line 272,col 39)",
        "(line 273,col 9)-(line 273,col 38)",
        "(line 274,col 9)-(line 274,col 67)",
        "(line 275,col 9)-(line 275,col 30)",
        "(line 276,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 301,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile2()",
      "begin_line": 310,
      "end_line": 344,
      "comment": "\n     * Tries to delete the file \"bla\" from an archive. This should\n     * result in the deletion of nothing.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 42)",
        "(line 312,col 9)-(line 312,col 53)",
        "(line 314,col 9)-(line 314,col 39)",
        "(line 315,col 9)-(line 315,col 38)",
        "(line 316,col 9)-(line 316,col 67)",
        "(line 317,col 9)-(line 317,col 30)",
        "(line 318,col 9)-(line 341,col 9)",
        "(line 343,col 9)-(line 343,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAddSame()",
      "begin_line": 353,
      "end_line": 417,
      "comment": "\n     * Tries to delete and then add a file with the same name.\n     * Should delete test/test3.xml and adds test.txt with the name\n     * test/test3.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 41)",
        "(line 355,col 9)-(line 355,col 53)",
        "(line 357,col 9)-(line 357,col 39)",
        "(line 358,col 9)-(line 358,col 38)",
        "(line 359,col 9)-(line 359,col 67)",
        "(line 360,col 9)-(line 360,col 30)",
        "(line 362,col 9)-(line 362,col 28)",
        "(line 363,col 9)-(line 391,col 9)",
        "(line 394,col 9)-(line 394,col 37)",
        "(line 395,col 9)-(line 395,col 26)",
        "(line 396,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testChangeSetResults()",
      "begin_line": 424,
      "end_line": 478,
      "comment": "\n     * Checks for the correct ChangeSetResults\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 42)",
        "(line 426,col 9)-(line 426,col 53)",
        "(line 428,col 9)-(line 428,col 39)",
        "(line 429,col 9)-(line 429,col 38)",
        "(line 430,col 9)-(line 430,col 67)",
        "(line 431,col 9)-(line 431,col 30)",
        "(line 432,col 9)-(line 475,col 9)",
        "(line 477,col 9)-(line 477,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAdd()",
      "begin_line": 487,
      "end_line": 526,
      "comment": "\n     * Tries to delete a directory with a file and adds a new directory with a\n     * new file and with the same name. Should delete dir1/* and add\n     * dir1/test.txt at the end\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 42)",
        "(line 489,col 9)-(line 489,col 53)",
        "(line 491,col 9)-(line 491,col 39)",
        "(line 492,col 9)-(line 492,col 38)",
        "(line 493,col 9)-(line 493,col 67)",
        "(line 494,col 9)-(line 494,col 30)",
        "(line 495,col 9)-(line 523,col 9)",
        "(line 525,col 9)-(line 525,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToZip()",
      "begin_line": 533,
      "end_line": 572,
      "comment": "\n     * Adds a file to a zip archive. Deletes an other file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 41)",
        "(line 535,col 9)-(line 535,col 53)",
        "(line 537,col 9)-(line 537,col 39)",
        "(line 538,col 9)-(line 538,col 38)",
        "(line 539,col 9)-(line 539,col 67)",
        "(line 540,col 9)-(line 540,col 30)",
        "(line 541,col 9)-(line 569,col 9)",
        "(line 571,col 9)-(line 571,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteAdd()",
      "begin_line": 580,
      "end_line": 620,
      "comment": "\n     * add blub/test.txt + delete blub Should add blub/test.txt and delete it\n     * afterwards. In this example, the archive should stay untouched.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 42)",
        "(line 582,col 9)-(line 582,col 53)",
        "(line 584,col 9)-(line 584,col 39)",
        "(line 585,col 9)-(line 585,col 38)",
        "(line 586,col 9)-(line 586,col 67)",
        "(line 587,col 9)-(line 587,col 30)",
        "(line 588,col 9)-(line 617,col 9)",
        "(line 619,col 9)-(line 619,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddDelete()",
      "begin_line": 628,
      "end_line": 670,
      "comment": "\n     * delete bla + add bla/test.txt + delete bla Deletes dir1/* first, then\n     * suppresses the add of bla.txt because there is a delete operation later.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 42)",
        "(line 630,col 9)-(line 630,col 53)",
        "(line 632,col 9)-(line 632,col 39)",
        "(line 633,col 9)-(line 633,col 38)",
        "(line 634,col 9)-(line 634,col 67)",
        "(line 635,col 9)-(line 635,col 30)",
        "(line 636,col 9)-(line 667,col 9)",
        "(line 669,col 9)-(line 669,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromZip()",
      "begin_line": 677,
      "end_line": 710,
      "comment": "\n     * Simple Delete from a zip file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 39)",
        "(line 679,col 9)-(line 679,col 38)",
        "(line 680,col 9)-(line 680,col 25)",
        "(line 681,col 9)-(line 704,col 9)",
        "(line 706,col 9)-(line 706,col 56)",
        "(line 707,col 9)-(line 707,col 34)",
        "(line 709,col 9)-(line 709,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromTar()",
      "begin_line": 717,
      "end_line": 747,
      "comment": "\n     * Simple delete from a tar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 39)",
        "(line 719,col 9)-(line 719,col 38)",
        "(line 720,col 9)-(line 720,col 25)",
        "(line 721,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 56)",
        "(line 745,col 9)-(line 745,col 34)",
        "(line 746,col 9)-(line 746,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromJar()",
      "begin_line": 754,
      "end_line": 787,
      "comment": "\n     * Simple delete from a jar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 39)",
        "(line 756,col 9)-(line 756,col 38)",
        "(line 757,col 9)-(line 757,col 25)",
        "(line 758,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 784,col 56)",
        "(line 785,col 9)-(line 785,col 34)",
        "(line 786,col 9)-(line 786,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToTar()",
      "begin_line": 789,
      "end_line": 835,
      "comment": "",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 39)",
        "(line 791,col 9)-(line 791,col 38)",
        "(line 792,col 9)-(line 792,col 25)",
        "(line 793,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 56)",
        "(line 831,col 9)-(line 831,col 34)",
        "(line 832,col 9)-(line 832,col 42)",
        "(line 833,col 9)-(line 833,col 105)",
        "(line 834,col 9)-(line 834,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToJar()",
      "begin_line": 842,
      "end_line": 880,
      "comment": "\n     * Delete from a jar file and add another file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 39)",
        "(line 844,col 9)-(line 844,col 38)",
        "(line 845,col 9)-(line 845,col 25)",
        "(line 846,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 876,col 56)",
        "(line 877,col 9)-(line 877,col 34)",
        "(line 878,col 9)-(line 878,col 42)",
        "(line 879,col 9)-(line 879,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAr()",
      "begin_line": 887,
      "end_line": 918,
      "comment": "\n     * Simple delete from an ar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 39)",
        "(line 889,col 9)-(line 889,col 38)",
        "(line 890,col 9)-(line 890,col 25)",
        "(line 891,col 9)-(line 913,col 9)",
        "(line 915,col 9)-(line 915,col 56)",
        "(line 916,col 9)-(line 916,col 34)",
        "(line 917,col 9)-(line 917,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToAr()",
      "begin_line": 925,
      "end_line": 963,
      "comment": "\n     * Deletes a file from an AR-archive and adds another\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 39)",
        "(line 927,col 9)-(line 927,col 38)",
        "(line 928,col 9)-(line 928,col 25)",
        "(line 929,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 959,col 56)",
        "(line 960,col 9)-(line 960,col 34)",
        "(line 961,col 9)-(line 961,col 33)",
        "(line 962,col 9)-(line 962,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testRenameAndDelete()",
      "begin_line": 973,
      "end_line": 974,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * mv dir1/test.text dir2/test.txt + delete dir1 Moves the file to dir2 and\n     * deletes everything in dir1\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddMoveDelete()",
      "begin_line": 986,
      "end_line": 987,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * add dir1/bla.txt + mv dir1/test.text dir2/test.txt + delete dir1\n     * \n     * Add dir1/bla.txt should be surpressed. All other dir1 files will be\n     * deleted, except dir1/test.text will be moved\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddToEmptyArchive()",
      "begin_line": 994,
      "end_line": 1032,
      "comment": "\n     * Check can add a file to an empty archive.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 41)",
        "(line 996,col 9)-(line 996,col 58)",
        "(line 998,col 9)-(line 998,col 39)",
        "(line 999,col 9)-(line 999,col 38)",
        "(line 1000,col 9)-(line 1000,col 30)",
        "(line 1001,col 9)-(line 1001,col 67)",
        "(line 1002,col 9)-(line 1002,col 30)",
        "(line 1003,col 9)-(line 1003,col 44)",
        "(line 1004,col 9)-(line 1029,col 9)",
        "(line 1031,col 9)-(line 1031,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddToOneFileArchive()",
      "begin_line": 1039,
      "end_line": 1080,
      "comment": "\n     * Check can delete and add a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 41)",
        "(line 1041,col 9)-(line 1041,col 64)",
        "(line 1043,col 9)-(line 1043,col 39)",
        "(line 1044,col 9)-(line 1044,col 38)",
        "(line 1045,col 9)-(line 1045,col 30)",
        "(line 1046,col 9)-(line 1046,col 67)",
        "(line 1047,col 9)-(line 1047,col 30)",
        "(line 1048,col 9)-(line 1048,col 44)",
        "(line 1049,col 9)-(line 1077,col 9)",
        "(line 1079,col 9)-(line 1079,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteToOneFileArchive()",
      "begin_line": 1087,
      "end_line": 1128,
      "comment": "\n     * Check can add and delete a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 42)",
        "(line 1089,col 9)-(line 1089,col 64)",
        "(line 1091,col 9)-(line 1091,col 39)",
        "(line 1092,col 9)-(line 1092,col 38)",
        "(line 1093,col 9)-(line 1093,col 30)",
        "(line 1094,col 9)-(line 1094,col 67)",
        "(line 1095,col 9)-(line 1095,col 30)",
        "(line 1096,col 9)-(line 1096,col 44)",
        "(line 1097,col 9)-(line 1125,col 9)",
        "(line 1127,col 9)-(line 1127,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddAllreadyExistingWithReplaceTrue()",
      "begin_line": 1136,
      "end_line": 1172,
      "comment": "\n     * Adds a file with the same filename as an existing file from the stream.\n     * Should lead to a replacement.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1137,col 41)",
        "(line 1138,col 9)-(line 1138,col 53)",
        "(line 1140,col 9)-(line 1140,col 39)",
        "(line 1141,col 9)-(line 1141,col 38)",
        "(line 1142,col 9)-(line 1142,col 67)",
        "(line 1143,col 9)-(line 1143,col 30)",
        "(line 1144,col 9)-(line 1169,col 9)",
        "(line 1171,col 9)-(line 1171,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddAllreadyExistingWithReplaceFalse()",
      "begin_line": 1180,
      "end_line": 1218,
      "comment": "\n     * Adds a file with the same filename as an existing file from the stream.\n     * Should lead to a replacement.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1181,col 9)-(line 1181,col 41)",
        "(line 1182,col 9)-(line 1182,col 53)",
        "(line 1184,col 9)-(line 1184,col 39)",
        "(line 1185,col 9)-(line 1185,col 38)",
        "(line 1186,col 9)-(line 1186,col 67)",
        "(line 1187,col 9)-(line 1187,col 30)",
        "(line 1188,col 9)-(line 1215,col 9)",
        "(line 1217,col 9)-(line 1217,col 54)"
      ]
    }
  ]
}