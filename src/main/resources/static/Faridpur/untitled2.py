# -*- coding: utf-8 -*-
"""
Created on Mon Oct 21 22:07:19 2019

@author: Dell
"""


import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
import csv



for y in range(2001,2002):
    y=str(y)
    for k in range(1,366,16):
        if k<10:
            d='00'+str(k)
        elif k>10 and k<100:
            d='0'+str(k)
        else:
            d=str(k)
        b="a"+y+"-"+d+".txt"
        try:
            panda_train = pd.read_csv(b, sep=" " ,header = None, dtype = 'float64')
            panda_train_arr = panda_train.values
            row=panda_train_arr[:,0].size
            col=panda_train_arr[0,:].size
            print(f"{y} {k}")
            #print(row)
            #print(col)
        except:
            print('no')
            
                
        #print(panda_train_arr)
            
        plt.figure(figsize=(col/20,row/20))
        x1=[];x2=[]
        x3=[];x4=[];x5=[];x6=[];x7=[];x8=[]
        x9=[];x10=[]
        for i in range(0,row):
            for j in range(0,col):
                    
                if panda_train_arr[i,j] > 3.2766 and panda_train_arr[i,j]<3.2768:
                    x1.append(i)
                    x2.append(j)
                elif  (panda_train_arr[i,j]>0.51074 and panda_train_arr[i,j]<0.82051):
                    x3.append(i)
                    x4.append(j)
                elif  (panda_train_arr[i,j]>.0 and panda_train_arr[i,j]<.25):
                    x5.append(i)
                    x6.append(j)
                elif  (panda_train_arr[i,j]>.25 and panda_train_arr[i,j]<.5):
                    x7.append(i)
                    x8.append(j)
                else:
                    x9.append(i)
                    x10.append(j)
                       
        x1=np.array(x1)
        x2=np.array(x2)
        x3=np.array(x3)    
        x4=np.array(x4)  
        x5=np.array(x5)   
        x6=np.array(x6)   
        x8=np.array(x8)   
        x7=np.array(x7)
        x9=np.array(x9)   
        x10=np.array(x10)
        ss=15
        plt.xticks([]),plt.yticks([])
        plt.scatter(x2, -x1, color = 'black', marker = '.',s=ss*5)
        #plt.scatter(x6, -x5, color = 'yellow', marker = '.',s=ss)
        plt.scatter(x4, -x3, color = 'green', marker = '.',s=ss)
        #plt.scatter(x8, -x7, color = 'lawngreen', marker = '.',s=ss)
        #plt.scatter(x10, -x9, color = 'grey', marker = '.',s=ss)
        plt.savefig("a"+y+"-"+d+".png")
    
       
        
        #print(count)
        #print(f"{strg}: {count/count2*100}")
        