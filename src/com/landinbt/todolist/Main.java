/*
 * %W% %E% Daniel Basulto Del Toro
 *
 * Copyright (c) 2023 LandinBT. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Daniel Basulto Del Toro. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 *
 * LANDIN BT MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.landinbt.todolist;


import java.awt.EventQueue;

import com.landinbt.todolist.ui.MainWin;

/**
 * Class description goes here.
 *
 * @version 1.0 30 Oct 2023
 * @author Daniel Basulto Del Toro
 */
public class Main {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWin mainWin = new MainWin();
					mainWin.show();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
